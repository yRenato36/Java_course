package Aula06;

import java.util.Scanner;

public class ExerAula06 {
    /*
     * programa que receba 4 notas e armazena no array,
     * depois faça a média e apresente se o aluno passou
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int media = 0;
        final int tamCont = 4;
        int[] notas = new int[tamCont];

        for (int cont = 1; cont <= tamCont; cont++) {
            System.out.printf("digite sua %dº nota\n", cont);

            switch (cont) {
                case 1:
                    notas[0] = ler.nextInt();
                    break;
                case 2:
                    notas[1] = ler.nextInt();
                    break;
                case 3:
                    notas[2] = ler.nextInt();
                    break;
                default:
                    notas[3] = ler.nextInt();
            }
        }
        media = (notas[0] + notas[1] + notas[2] + notas[3]) / tamCont;
        if (media > 6) {
            System.out.println("Parabéns, você passou");
            System.out.printf("Média final: %d\n", media);
        }
        else {
            System.out.println("Sua média está abaixo de 6");
            System.out.printf("Média final: %d\n", media);
        }
    }
}
