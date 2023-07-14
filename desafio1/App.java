import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numbersQuantity = scan.nextInt();
        List<Integer> pairNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int index = 0; index < numbersQuantity; index++) {
            int number = scan.nextInt();
            if (number % 2 == 0) {
                pairNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        List<Integer> pairNumbersCrescent = pairNumbers.stream().sorted().toList();
        List<Integer> oddNumberDecrescent = oddNumbers.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("--------------------");
        pairNumbersCrescent.forEach(System.out::println);
        oddNumberDecrescent.forEach(System.out::println);
    }
}
