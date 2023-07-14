import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();

        System.out.println("NOTAS:");
        value = handleNotes(value);

        System.out.println("MOEDAS:");
        handleCoins(value);

        scan.close();
    }

    public static double handleNotes(double value) {
        int[] notes = {100, 50, 20, 10, 5, 2};

        for (int note : notes) {
            int notesQuantity = (int) (value / note);

            if (notesQuantity > 0) {
                System.out.println(message(notesQuantity, note));
                value %= note;
            } else {
                System.out.println(message(0, note));
            }
        }
        return value;
    }

    public static void handleCoins(double value) {
        double[] coins = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        for (double coin : coins) {
            int coinsQuantity = (int) (value / coin);

            if (coinsQuantity > 0) {
                System.out.println(message(coinsQuantity, coin));
                value %= coin;
            } else {
                System.out.println(message(0, coin));
            }
        }
    }

    public static String message(int quantity, double number) {
        return quantity
                + "     "
                + "nota(s)"
                + "     "
                + "de"
                + "     "
                + "R$"
                + "    "
                + String.format("%.2f", number);
    }
}
