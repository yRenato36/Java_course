
// 1. Elabore os seguintes métodos numa classe chamada Exercicios:
import java.util.random.RandomGenerator;

public class Exercicios {
    /**
     * a) Um método que recebe um valor inteiro (n) e apresenta em tela
     * n números inteiros gerados aleatoriamente.
     * 
     * @param n
     */
    public static void randomNumber(int n) {
        for (int x = 0; x < n; x++) {
            int ranNumber = (int) (Math.random() * n + 1);
            System.out.println("numero gerado: " + ranNumber);
        }
    }

    // =============================================ARRUMAR ESSE
    // EXERCÍCIO===================================================
    /**
     * b) Um método que recebe uma frase e retorna a quantidade de vogais
     * existentes nessa frase.
     * 
     * @param word
     */
    public static void contVogais(String word) {
        int qtdLetras = word.length();
        String palavra = word.toLowerCase();
        char[] arrayVogais = { 'a', 'e', 'i', 'o', 'u' };
        int vogais = 0;

        for (int x = 0; x < qtdLetras; x++) {
            for (int y = 1; y < 6; y++) {
                if (arrayVogais[y-1] == palavra.charAt(x)) {
                    vogais++;
                }
            }
        }
        System.out.println("Quantidade de vogais encontradas: " + vogais);
    }

    /**
     * c) Um método que recebe três valores do tipo double e retorna a
     * média entre esses valores.
     * 
     * @param num1
     * @param num2
     * @param num3
     */
    public static void media(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3;
        System.out.println("Media dos valores digitados: " + media);
    }

    /**
     * d) Um método que recebe um vetor de inteiros e retorna a quantidade
     * de números pares existentes.
     * 
     * @param numeros
     */
    public static void vetorInteiros(int[] numeros) {
        int par = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("Quantidade de numeros pares encontrados: " + par);
    }
}