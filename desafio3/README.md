# Contagem de Pares entre Elementos de uma Lista

Este código Java é responsável por ler uma lista de números fornecida pelo usuário e contar a quantidade de pares encontrados entre elementos consecutivos dessa lista.

## Pré-requisitos
- Java Development Kit (JDK) instalado no seu sistema.
- Algum ambiente de desenvolvimento Java, como Eclipse ou IntelliJ IDEA (opcional).

## Como usar o código 
1. Copie o código fornecido para um novo arquivo Java no seu ambiente de desenvolvimento ou crie um novo projeto Java.
2. Compile e execute o código.

## Explicação do código

1. Leitura do Tamanho da lista:

```
System.out.print("Digite o tamanho da lista: ");
int length = scan.nextInt();
```

2. Criação da lista arr:
```
List<Integer> arr = new ArrayList<>();
```
- Cria uma lista vazia para armazenar os elementos da lista fornecidos pelo usuário.
- 
3. Leitura dos elementos da lista:
```
System.out.println("Digite os elementos da lista:");

for (int index = 0; index < length; index++) {
    System.out.print("Numero: ");
    arr.add(scanner.nextInt());
}
```
4. Chamada do método **countPairsBetweenElements**:
```
int quantityPairs = countPairsBetweenElements(arr);

System.out.println(quantityPairs);
```
- Chama o método countPairsBetweenElements, passando a lista arr como argumento. O método retorna a quantidade de pares encontrados entre elementos consecutivos e imprime esse valor na saída

5. Método **countPairsBetweenElements**:
```
public static int countPairsBetweenElements(List<Integer> numbers) {
    int quantityPairs = 0;

    for (int index = 0; index < numbers.size() - 1; index++) {
        int currentElement = numbers.get(index);
        int nextElement = numbers.get(index + 1);

        int difference = nextElement - currentElement;

        if (difference % 2 == 0) {
            quantityPairs += 1;
        }
    }

    return quantityPairs;
}
```

- O método countPairsBetweenElements recebe a lista de números e itera sobre ela, verificando a diferença entre cada elemento consecutivo. Se a diferença for um número par, a quantidade de pares é incrementada. No final, o método retorna a quantidade total de pares encontrados.

## Exemplo de Uso
Suponha que você execute o programa com a entrada a seguir:

```
Digite o tamanho da lista: 5
Digite os elementos da lista:
Numero: 3
Numero: 7
Numero: 9
Numero: 6
Numero: 10
```

A saída será:
```
2
```
A lista fornecida é [3, 7, 9, 6, 10]. Existem dois pares consecutivos: (7, 9) e (6, 10), portanto, a saída é 2.

Isso conclui a explicação do código para a contagem de pares entre elementos de uma lista. Agora você pode usá-lo para contar a quantidade de pares em suas próprias listas de números.


