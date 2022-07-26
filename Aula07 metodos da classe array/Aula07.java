package Aula07;

import java.util.Arrays;

public class Aula07 {
    public static void main(String[] args) {
        int[] num  = {90,20,70,10,80,50,30,40,0,60};
        final int tamanho = 10;
        int[] numeros = new int[tamanho];
        int posicao = 0;

        // esse método ordena os valores do array
        Arrays.sort(num);
        
        // esse método preenche todos os valores do array
        //Arrays.fill(numeros,10);   
        
        // esse método copia os valores de outro array
        // quem será copiado? qual posição incial da copia? para onde vai a cópia? qual o inicio do preenchimento? quantos elementos serão copiado?
        //System.arraycopy(num, 0, numeros ,0 , tamanho);
        
        //Arrays.equals(num, numeros) compara se 2 arrays são iguais, retorna true or false
        //System.out.printf("Os Arrays são iguais? %s", Arrays.equals(num, numeros) ? "verdade" : "mentira");

        //Arrays.binarySearch(num, 3) pesquisa em um valor no array, retorna o número da sua posição
        //essa pesquisa é feita apenas com os valores do array em ordem
        posicao = Arrays.binarySearch(num, 40);
        System.out.printf("o elemento está no array? %s\n qual sua posição? %d", posicao >= 0, posicao);

        //esse tipo de for, pode ser utilizado para ler elementos de um array 
        for(int n: num){
            System.out.printf("elementos do array: %d\n", n);
        }
        System.out.println("");
    }
}
