
/* faça um joguinho onde o usuário insere um número de vidas entre 1 e 10,
utilize +1 para adicionar 1 vida e -1 para retirar 1 vida 
OBS: utilize os conceitos aprendendidos na Aula12*/
import java.util.Scanner;

public class ExerAula12 {
    public static void main(String[] args) {
        // chama outra classe
        ExerAula12_part2 recebe = new ExerAula12_part2();
        System.out.println("Bem-Vindo ao joguinho ;)\nDigite 1 para entrar, e 0 para sair");

        // lê e armazena o que leu na variável vidas
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma quantidade de vidas\n");
        int vidas = ler.nextInt();
        // chama o método que está dentro da classe qtdVidas e envia o valor que Scanner
        // leu
        recebe.qtdVidas(vidas);

        System.out.println("\npara adicionar 1 vida digite +1\npara retirar 1 vida digite -1");
        int numVidas = ler.nextInt();
        // chama o método que está dentro da classe addVidas e envia o valor que Scanner
        // leu
        recebe.addVidas(numVidas);
    }
}