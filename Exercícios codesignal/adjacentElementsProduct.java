/* Dada uma matriz de inteiros, encontre o par de elementos adjacentes que tem o maior produto 
e retorne esse produto.

Exemplo
Para inputArray = [3, 6, -2, -5, 7, 3], a saída deve ser
solution(inputArray) = 21.

7 e 3 produzir o maior produto. */

public class adjacentElementsProduct {
    public static void main(String[] args) {
        int[] inputArray = { -23, 4, -3, 8, -12 };
        int times = 0, acum = 0, cont2 = 0;

        for (int cont = 0; cont < inputArray.length; cont++) {
            if (cont2 < inputArray.length - 1) {
                cont2++;
            }
            if (inputArray[cont] != inputArray[cont2]) {
                times = inputArray[cont] * inputArray[cont2];
                System.out.printf("valores do array %d\n", times);
            }
            if (times > acum) {
                acum = times;
            }
        }
        System.out.printf("%d", acum);
    }
}
