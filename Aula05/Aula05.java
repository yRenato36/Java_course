package Aula05;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um número");
        int num = ler.nextInt();
        int cont = 0;

        for(cont = 1; cont <= num; cont++)
        {
            System.out.printf("(for)Executou %d vezes\n", cont);
        }
        
        cont = 0;
        System.out.print("\n");
        
        while(cont < num)
        {         
            cont++;
            System.out.printf("(while)Executou %d Vezes\n", cont);
        }

        cont = 0;
        System.out.print("\n");

        do
        {
            cont++;
            System.out.printf("(dowhile)Executou %d vezes\n", cont);
        }while(cont < num);
    }
}
