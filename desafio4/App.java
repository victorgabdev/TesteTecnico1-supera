import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de frases infectadas: ");
            int quantidadeFrases = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro

            List<String> frasesInfectadas = new ArrayList<>();

            System.out.println("Digite as frases infectadas:");

            for (int i = 0; i < quantidadeFrases; i++) {
                String fraseInfectada = scanner.nextLine();
                frasesInfectadas.add(fraseInfectada);
            }

            List<String> frasesDecifradas = decifrarFrases(frasesInfectadas);

            System.out.println("Frases decifradas:");

            for (String fraseDecifrada : frasesDecifradas) {
                System.out.println(fraseDecifrada);
            }
        }

        public static List<String> decifrarFrases (List < String > frasesInfectadas) {
            List<String> frasesDecifradas = new ArrayList<>();

            for (String fraseInfectada : frasesInfectadas) {
                String decifrada = decifrarLinha(fraseInfectada);
                frasesDecifradas.add(decifrada);
            }

            return frasesDecifradas;
        }

        public static String decifrarLinha (String linha){
            int tamanho = linha.length();
            StringBuilder sb = new StringBuilder(tamanho);

            for (int i = tamanho / 2 - 1; i >= 0; i--) {
                sb.append(linha.charAt(i));
            }

            for (int i = tamanho - 1; i >= tamanho / 2; i--) {
                sb.append(linha.charAt(i));
            }

            return sb.toString();
        }
}


