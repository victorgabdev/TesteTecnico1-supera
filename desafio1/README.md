# Código para Ordenação de Números Pares e Ímpares

Este é um código Java que recebe uma quantidade de valores e os ordena
com base no critério de primeiro apresentar os números pares em ordem crescente,
seguidos pelos números ímpares em ordem decrescente.

## Pré-requisitos 

- Java Development Kit (JDK) instalado no seu sistema.
- Algum ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA (opcional).

## Como usar o código

1. Copie o código fornecido para um novo arquivo Java no seu ambiente de desenvolvimento ou crie um novo projeto Java.
2. Compile e execute o código.

## Explicação do código
 
1.  Criação do objeto **`Scanner`**
2. Ler a quantidade de números a serem inseridos
3. Criação de listas vazias -> **pairNumbers** e **oddNumbers**
4. Laço de repetição para leitura e classificação dos números:
   
```
for (int index = 0; index < numbersQuantity; index++) {
    int number = scan.nextInt();
    if (number % 2 == 0) {
        pairNumbers.add(number);
    } else {
        oddNumbers.add(number);
    }
}
   ```
- O laço lê os números inseridos pelo usuário e os adiciona à lista correspondente (pairNumbers para números pares e oddNumbers para números ímpares).

5. Fechamento do objeto **`Scanner`**
6. Ordenação das listas:

```
Collections.sort(pairNumbers);
Collections.sort(oddNumbers, Collections.reverseOrder());
```
- Ordena a lista pairNumbers em ordem crescente e a lista oddNumbers em ordem decrescente.

7. Impressão dos números ordenados

## Exemplo de Uso
Suponha que você execute o programa com a entrada a seguir:


```
10
5
2
8
9
1
4
7
6
3
0
```

A saída será:
```
--------------------
0
2
4
6
8
9
7
5
3
1
```
Os números pares são apresentados em ordem crescente (0, 2, 4, 6, 8) e os números ímpares em ordem decrescente (9, 7, 5, 3, 1).
Isso conclui a explicação do código para ordenação de números pares e ímpares. Agora você pode usá-lo para classificar seus próprios conjuntos de números seguindo o mesmo critério.