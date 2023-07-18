# Cálculo de Notas e Moedas

Este código Java é responsável por ler um número com suas casas decimais e calcular a menor quantidade de notas e moedas possíveis em que o valor pode ser decomposto.

## Pré-requisitos
- Java Development Kit (JDK) instalado no seu sistema.
- Algum ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA (opcional).

## Como usar o código

1. Copie o código fornecido para um novo arquivo Java no seu ambiente de desenvolvimento ou crie um novo projeto Java.
2. Compile e execute o código.

## Explicação do código
 1. Definição da configuração regional 
 ```
Locale.setDefault(Locale.US);
```
- Configura o padrão regional para usar o ponto como separador decimal.

2. Leitura do valor
 ```
double value = scan.nextDouble();
```
3. Chamada do método **handleNotes**:
```
System.out.println("NOTAS:");
value = handleNotes(value);
```
- Imprime a categoria "NOTAS" e chama o método handleNotes, passando o valor como argumento. O método handleNotes é responsável por calcular a quantidade mínima de notas necessárias e retornar o valor restante.
4. Chamada do método **handleCoins**:
```
System.out.println("MOEDAS:");
handleCoins(value);
```
- Imprime a categoria "MOEDAS" e chama o método handleCoins, passando o valor restante como argumento. O método handleCoins é responsável por calcular a quantidade mínima de moedas necessárias.

5. Método **handleNotes**:
```
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
```
- O método **handleNotes** recebe o valor e itera sobre uma lista de valores de notas em ordem decrescente. Para cada nota, ele calcula a quantidade necessária de notas desse valor e atualiza o valor restante. O método imprime a mensagem com a quantidade de notas usadas ou zero se não for necessário usar notas desse valor.

6. Método **handleCoins**:
```
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
```
- O método handleCoins recebe o valor restante e itera sobre uma lista de valores de moedas em ordem decrescente. Para cada moeda, ele calcula a quantidade necessária de moedas desse valor e atualiza o valor restante. O método imprime a mensagem com a quantidade de moedas usadas ou zero se não for necessário usar moedas desse valor.

7. Método **message**:
```
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
```
- O método message recebe a quantidade e o valor de uma nota ou moeda e retorna uma string formatada contendo a quantidade de nota(s) e o valor correspondente.

## Exemplo de Uso
Suponha que você execute o programa com a entrada a seguir:
```
576.73
```

A saída será:

```
NOTAS:
5     nota(s)     de     R$     100.00
1     nota(s)     de     R$     50.00
1     nota(s)     de     R$     20.00
0     nota(s)     de     R$     10.00
1     nota(s)     de     R$     5.00
0     nota(s)     de     R$     2.00
MOEDAS:
1     nota(s)     de     R$     1.00
1     nota(s)     de     R$     0.50
2     nota(s)     de     R$     0.25
2     nota(s)     de     R$     0.10
0     nota(s)     de     R$     0.05
3     nota(s)     de     R$     0.01
```

Isso conclui a explicação do código para cálculo de notas e moedas. Agora você pode usá-lo para calcular a quantidade mínima de notas e moedas necessárias para qualquer valor fornecido pelo usuário.
