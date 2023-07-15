import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Quantidade de frases infectadas: ");
            int phrasesQuantity = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro

            List<String> infectedPhrases = new ArrayList<>();

            System.out.println("Digite as frases infectadas:");

            for (int index = 0; index < phrasesQuantity; index++) {
                String infectedPhrase = scanner.nextLine();
                infectedPhrases.add(infectedPhrase);
            }

            List<String> decipheredPhrases = decipherPhrases(infectedPhrases);

            System.out.println("----------------------");

            for (String decipheredPhrase : decipheredPhrases) {
                System.out.println(decipheredPhrase);
            }
        }

        public static List<String> decipherPhrases(List < String > infectedPhrases) {
            List<String> decipheredPhrases = new ArrayList<>();

            for (String infectedPhrase : infectedPhrases) {
                String deciphered = decipherLine(infectedPhrase);  // aqui
                decipheredPhrases.add(deciphered);
            }

            return decipheredPhrases;
        }

        public static String decipherLine(String line){
            int size = line.length();
            StringBuilder sb = new StringBuilder(size);

            for (int index = size / 2 - 1; index >= 0; index--) {
                sb.append(line.charAt(index));
            }

            for (int index = size - 1; index >= size / 2; index--) {
                sb.append(line.charAt(index));
            }

            return sb.toString();
        }
}


