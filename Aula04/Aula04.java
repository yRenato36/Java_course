package Aula04;

//chama a classe de leitura de teclado
import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        
        // cria uma instância para ler
        Scanner leitura = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, nota = 0;
        String nome = "", res = "";
        // variável contante, não é possível alterar o valor durante o programa
        final int MEDIA = 6;

        System.out.println("digite o nome do aluno: ");
        // nextLine para receber tipos strings
        nome = leitura.nextLine();

        System.out.println("digite 1º nota: ");
        // utiliza a instância criada e coloca o valor recebido na variável n1 =
        // leitura.nextInt();

        System.out.println("digite 2º nota: ");
        n2 = leitura.nextInt();

        System.out.println("digite 3º nota: ");
        n3 = leitura.nextInt();

        System.out.println("digite 4º nota: ");
        n4 = leitura.nextInt();

        nota = (n1 + n2 + n3 + n4) / 4;

        if (nota >= MEDIA) {
            res = "Aluno(a) Aprovado(a)";
        } else {
            res = "Aluno(a) Reprovado(a)";
        }
        // utilize printf imprimir variáveis
        System.out.printf("Obrigado %s \nSua média é: %d \n%s", nome, nota, res);
    }
}
