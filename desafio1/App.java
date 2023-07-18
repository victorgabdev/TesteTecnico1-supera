import java.util.*;

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
        
        scan.close();

        Collections.sort(pairNumbers);
        Collections.sort(oddNumbers, Collections.reverseOrder());

        System.out.println("--------------------");
        pairNumbers.forEach(System.out::println);
        oddNumbers.forEach(System.out::println);
    }
}
