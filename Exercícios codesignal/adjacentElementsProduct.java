/* Dada uma matriz de inteiros, encontre o par de elementos adjacentes que tem o maior produto 
e retorne esse produto.

Exemplo
Para inputArray = [3, 6, -2, -5, 7, 3], a saída deve ser
solution(inputArray) = 21.

7 e 3 produzir o maior produto. */

public class adjacentElementsProduct {
    public static void main(String[] args) {
        
        //SEGUNDA SOLUÇÃO
        int[] inputArray = { -23, 4, -3, 8, -12 };

        // atribui a multiplicação dos arrays na variável
        int max = inputArray[0] * inputArray[1];

        for (int pos = 1; pos < inputArray.length - 1; pos++) {
            //multiplica os arrays em cada posição, índice 0 * índice 1....
            int times = inputArray[pos] * inputArray[pos + 1];
            // utiliza a variável max como parâmetro de compraração à multiplicação da variável times
            // caso max for menor que a times
            // irá atribuir o novo valor de times para a variável max
            if (max < times) {
                max = times;
            }
        }
        System.out.printf("%d", max);

        //PRIMEIRA SOLUÇÃO 95% CERTA
        /*
         * int times = 0, acum = 0, cont2 = 0;
         * 
         * for (int cont = 0; cont < inputArray.length; cont++) {
         * if (cont2 < inputArray.length - 1) {
         * cont2++;
         * }
         * if (inputArray[cont] != inputArray[cont2]) {
         * times = inputArray[cont] * inputArray[cont2];
         * System.out.printf("valores do array %d\n", times);
         * }
         * if (times > acum) {
         * acum = times;
         * }
         * }
         * System.out.printf("%d", acum);
         */
    }
}
