import java.util.Arrays;

/*
João recebeu tamanhos diferentes estátuas como presente do CodeMaster em seu aniversário, 
cada estátua tendo um tamanho inteiro não negativo.

Como ele gosta de fazer as coisas perfeitas,
ele quer organizá-las do menor para o maior, de modo que cada estátua seja maior que a anterior.

Ele pode precisar de algumas estátuas adicionais para conseguir isso.

Ajude-o a descobrir o número mínimo
de estátuas adicionais necessárias.1

Exemplo:
Para as estátuas = [6, 2, 3, 8] a saída deve ser
solution(statues) = 3.

João precisa de estátuas de 4 tamanhos 5 e 7.
*/

/* 
 * ação: fazer uma sequência iniciando do menor número do array dado e preenchendo os números que faltam na sequência
 * depois contar quantos números foram preenchidos que completam a sequência
 */

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = { 6, 2, 3, 8 }; // recebe os valores do array
        int num = statues.length; // recebe a qtd de indices do array, no caso, indice até 4

        Arrays.sort(statues); // coloca os valores do array em ordem crescente, fica assim: {2, 3, 6, 8}
        int min = statues[0]; // recebe o menor valor do array
        int max = statues[num - 1]; // não posso colocar o num direto pois num = 4 esse array não possui indice 4

        System.out.printf("qtd de valores %d", max - min - num + 1); //subtrai a qtd de um array pelo outro
    }
}
