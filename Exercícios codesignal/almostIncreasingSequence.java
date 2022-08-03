import java.sql.Array;
import java.util.Arrays;

/* 
Dada uma sequência de inteiros como uma matriz, 
determine se é possível obter uma sequência estritamente crescente 
removendo não mais do que um elemento da matriz.

Nota: a sequência, também é considerada estritamente crescente se ela conter
apenas um elemento. 

Exemplo: Para sequence = [1, 3, 2, 1], a saída deve ser solution(sequence) = false.
Pois não há um elemento nesta matriz que possa ser removido para obter uma sequência estritamente crescente.

Para sequence = [1, 3, 2], a saída deve ser solution(sequence) = true.
removendo 3 da matriz para obter a sequência estritamente crescente [1, 2]. 
Como alternativa, você pode remover 2 para obter a sequência estritamente crescente [1, 3]. 

Qual critério para remover um elemento?
*/

public class almostIncreasingSequence {
    public static void main(String[] args) {
        int[] inputArray = { 1, 3, 2, 1 }; // array de input { 1, 3, 2, 1 }
        Arrays.sort(inputArray);

        int min = inputArray[0]; // min array
        int taman = inputArray.length; // tamanho array
        int max = inputArray[taman - 1]; // max array
        int count = 0;

        for (int cont = 1; cont <= taman; cont++){
            int valAnt = inputArray[cont - 1]; // armazena o valor um valor do array
            inputArray[cont - 1] = 0; // zera no indice que está rodando um valor do array
            
            //contador até 3
            if(cont <= 3)
                count++;

            if (inputArray[cont - 1] <= inputArray[count]) {
                System.out.print("sequencia - ");
                System.out.printf("%d, ", inputArray[cont - 1]);
            } else {
                System.out.println("nao sequencia");
            }
            inputArray[cont - 1] = valAnt;
            System.out.printf("%d, ", inputArray[cont - 1]);
        }


        // criando uma sequência do array
       /*  for (int cont = 1; cont <= taman; cont++) {
            if (inputArray[cont - 1] <= inputArray[taman-1]) {
                System.out.print("sequencia - ");
                System.out.printf("%d, ", inputArray[cont - 1]);
            } else {
                System.out.println("nao sequencia");
            }
        } */
    }
}
