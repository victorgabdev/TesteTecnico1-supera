import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int length = scan.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Digite os elementos da lista:");

        for (int index = 0; index < length; index++) {
            System.out.print("Numero: ");
            arr.add(scanner.nextInt());
        }

        int quantityPairs = countPairsBetweenElements(arr);

        System.out.println(quantityPairs);
    }

    public static int countPairsBetweenElements(List<Integer> numbers) {
        int quantityPairs = 0;

        for (int index = 0; index < numbers.size() - 1; index++) {
            int currentElement = numbers.get(index);
            int nextElement = numbers.get(index + 1);

            int difference = nextElement - currentElement;

            if(difference % 2 == 0 ) quantityPairs += 1;
        }

         return quantityPairs;
    }
}
