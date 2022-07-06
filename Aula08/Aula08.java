package Aula08;

import java.security.SecureRandom;
import java.util.Arrays;

public class Aula08 {
    public static void main(String[] args)
    {
        final int linhas = 3;
        final int colunas = 5;
        //matriz, a 1ª chave são as linhas, 2ª chave são as colunas
        //são arrays dentro de outro array
        int[][] numeros = new int[linhas][colunas];
        
        for(int lin = 0; lin < linhas; lin++) {
            for(int con = 0; con < colunas; con++) {
                numeros[lin][con] = new SecureRandom().nextInt(100);
            }
        }

        
        //IMPRESSÃO DOS ARRAYS COM FOR COMUM
        //primeiro cria a 1ª linha(1ºarray) e preenche os os valores do 2ª array(colunas)
        System.out.println("IMPRESSÃO DOS ARRAYS COM FOR COMUM");
        for(int lin = 0; lin < linhas;  lin++) {
            System.out.print("[");
            //aqui preenche com os itens do 2º array no 1º espaço do array linhas
            for(int con = 0; con < colunas; con++) {
                System.out.printf("%2d, ", numeros[lin][con]);
            }
            System.out.printf("] %dº Array linha", lin + 1);
            System.out.println("");
        }
        System.out.println("");
        //IMPRESSÃO DOS ARRAYS COM FOR PARA ARRAYS
        System.out.println("IMPRESSÃO DOS ARRAYS COM FOR PARA ARRAYS");
        for(int[] n: numeros) {
            System.out.print("[");
            for(int v: n) {
                System.out.printf("%2d, ", v);
            }
            System.out.printf("] ");
            System.out.println("");
        }
        
        System.out.println("");
        //criando matriz já com os valores pré-definidos
        int[][] num = {{1,2,3,4,5},{10,20,30,40,50},{100,200,300,400,500}};
        System.out.println("IMPRESSÃO DOS ARRAYS COM VALORES PRÉ-DEFINIDOS");
        for(int[] n: num) {
            System.out.print("[");
            for(int v: n) {
                System.out.printf("%3d, ", v);
            }
            System.out.printf("] ");
            System.out.println("");
        }
    }   
}
