package Aula06;

public class ExAula06 {
    public static void main(String[] args) {
        char[] gabarito = { 'a', 'a', 'd', 'b', 'c' };
        int nota = 0;
        
        final int tamanho = 5;
        char[] respostas = new char[tamanho];
        
        respostas[0] = 'a';
        respostas[1] = 'b';
        respostas[2] = 'c';
        respostas[3] = 'b';
        respostas[4] = 'c';

        for (int contador = 0; contador < tamanho; contador++) {
            if (respostas[contador] == gabarito[contador]) {
                nota++;
            }
        }
        System.out.printf("Nota final do aluno: %d", nota);
    }
}
