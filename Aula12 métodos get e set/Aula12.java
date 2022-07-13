import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args){
    
        Jogador j1 = new Jogador(1);
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número de vidas do seu jogador");
        //leio um número e atribuo ao método set, onde esse número se torna as vidas do jogador
        int recebeVidas = ler.nextInt();
        j1.setVidas(recebeVidas);
        
        //add +1 vida
        j1.addVidas();
        /* com a função get eu posso puxar o valor de uma variável que
        está em outra classe para esta classe */
        System.out.printf("jogador 1: %d vidas", j1.getVidas());
    }
}
