package Aula07;

import java.util.Scanner;

public class ExerAula07 {

    /*
     * receba 4 valores inseridos pelos usuário,
     * armazene em um array depois peça ao usuário escolher uma
     * posição que apresentará um dos valores inseridos, esse processo de apresentar os valores 
     * pode ser feito indeterminadas vezes, utilize um número >= 4 para sair
     */
    public static void main(String[] args) {

        int cont = 0, inserido = 0, escolha = 0;
        Scanner ler = new Scanner(System.in);

        //definindo o array e seu tamanho
        final int tamanho = 4;
        int[] valor = new int[tamanho];

        //recebendo valores e preenchendo no array
        for (cont = 0; cont < valor.length; cont++) {
            System.out.println("Insira um valor inteiro");
            inserido = ler.nextInt();
            
            valor[cont] = inserido;
        }
        
        //pula uma linha
        System.out.println(""); 

        //apresenta os valores contidos no array
        for(int valores: valor)         
            System.out.printf("valores do array: %d\n", valores);
        
        //pula uma linha
        System.out.println(""); 

        //repete a apresentação de valores armazenado no array, digite um número >= 4 para fechar
        do {
            System.out.println("\nescolha uma posição de 0 a 3 para apresentar um valor armazenado\ndigite 0 para sair");
            escolha = ler.nextInt();
            if(escolha >= 0 && escolha <= 3)
                System.out.printf("Valor armazenado %d\n", valor[escolha]);

        }while(escolha >= 0 && escolha <= 3);
        System.out.println("Você saiu");  
    }
}
