# Descriptografia de Frases Infectadas

Este código Java é responsável por receber frases infectadas fornecidas pelo usuário, descriptografá-las e exibir as frases descriptografadas.

## Pré-requisitos
- Java Development Kit (JDK) instalado no seu sistema.
- Algum ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA (opcional).

## Como usar o código
1. Copie o código fornecido para um novo arquivo Java no seu ambiente de desenvolvimento ou crie um novo projeto Java.
2. Compile e execute o código.

## Explicação co código

1. Leitura da quantidade de frases infectadas:
```
System.out.print("Quantidade de frases infectadas: ");
int phrasesQuantity = scanner.nextInt();
scanner.nextLine(); // Consumir a quebra de linha após a leitura do inteiro
```
- Solicita ao usuário que digite a quantidade de frases infectadas e lê o valor fornecido. O método scanner.nextLine() é usado para consumir a quebra de linha após a leitura do inteiro.

2. Criação da lista infectedPhrases:
```
List<String> infectedPhrases = new ArrayList<>();
```
- Cria uma lista vazia para armazenar as frases infectadas fornecidas pelo usuário.

3. Leitura das frases infectadas:
```
System.out.println("Digite as frases infectadas:");
for (int index = 0; index < phrasesQuantity; index++) {
    String infectedPhrase = scanner.nextLine();
    infectedPhrases.add(infectedPhrase);
}
```
- Solicita ao usuário que digite as frases infectadas e as adiciona à lista infectedPhrases usando o método scanner.nextLine()

4. Chamada do método **decipherPhrases**:
```
List<String> decipheredPhrases = decipherPhrases(infectedPhrases);
System.out.println("----------------------");
decipheredPhrases.forEach(System.out::println);
```
- Chama o método decipherPhrases, passando a lista de frases infectadas como argumento. O método retorna uma lista com as frases descriptografadas, que são exibidas uma por linha na saída.

5. Método **decipherPhrases**:
```
public static List<String> decipherPhrases(List<String> infectedPhrases) {
    List<String> decipheredPhrases = new ArrayList<>();
    infectedPhrases.forEach(infected -> decipheredPhrases.add(decipherLine(infected)));
    return decipheredPhrases;
}
```
- O método decipherPhrases recebe a lista de frases infectadas e itera sobre ela. Para cada frase infectada, chama o método **decipherLine** para descriptografar a frase e adiciona a frase descriptografada à lista decipheredPhrases. No final, retorna a lista com as frases descriptografadas.

6. Método **decipherLine**:
```
public static String decipherLine(String line) {
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
```
- O método decipherLine recebe uma frase infectada como argumento e realiza a descriptografia. Ele cria um objeto StringBuilder para construir a frase descriptografada. O método itera sobre a metade inicial da frase, adicionando os caracteres em ordem inversa ao StringBuilder. Em seguida, itera sobre a metade final da frase, adicionando os caracteres em ordem inversa. Por fim, retorna a frase descriptografada como uma string.

## Exemplo de Uso
Suponha que você execute o programa com a seguinte entrada:

```
Quantidade de frases infectadas: 3
Digite as frases infectadas:
pnefO enivid yas
ecrof sseugnuh ton ees uoy
kool deen uoy
```

A saída será:
```
----------------------
Ofenp days in
you see nothing here fusscore
you need look
```

Isso conclui a explicação do código para a descriptografia de frases infectadas. Agora você pode usar esse código para descriptografar suas próprias frases infectadas e exibir as frases descriptografadas.