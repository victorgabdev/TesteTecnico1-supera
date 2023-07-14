import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double value = scan.nextDouble();

        int[] moneyNotes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        System.out.println("NOTAS:");

        for (int index = 0; index < moneyNotes.length; index++) {
            int notesQuantity = (int) (value / moneyNotes[index]);  // 576.73 / 100
            if (notesQuantity > 0) {
                System.out.println(notesQuantity
                        + "     "
                        + "nota(s)"
                        + "     "
                        + "de"
                        + "     "
                        + "R$"
                        + "    "
                        + String.format("%.2f", (double) moneyNotes[index]));
                // System.out.println(moneyNotes[index] + ": " + notesQuantity);
                value %= moneyNotes[index];
            } else {
                System.out.println(0
                        + "     "
                        + "nota(s)"
                        + "     "
                        + "de"
                        + "     "
                        + "R$"
                        + "    "
                        + String.format("%.2f", (double) moneyNotes[index]));
            }
        }

        System.out.println("MOEDAS:");

        for (int index = 0; index < coins.length; index++) {
            int coinsQuantity = (int) (value / coins[index]);
            if (coinsQuantity > 0) {
                System.out.println(coinsQuantity
                        + "     "
                        + "moeda(s)"
                        + "     "
                        + "de"
                        + "     "
                        + "R$"
                        + "    "
                        + String.format("%.2f", (double) coins[index]));
                value %= coins[index];
            } else {
                System.out.println(0
                        + "     "
                        + "moeda(s)"
                        + "     "
                        + "de"
                        + "     "
                        + "R$"
                        + "    "
                        + String.format("%.2f", (double) coins[index]));
            }
        }

        scan.close();
    }
}
