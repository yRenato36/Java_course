package Aula06;

public class Aula06 {

    public static void main(String[] args) {
        //é possível utilizar variáveis contantates para definir o tamanho do array
        //para criar um array em java é necessário instânciar um objeto
        final int tamanho = 5;
        int[] num = new int[tamanho];

        //adicionar elementos ao array
        //nome  array + indice + valor 
        num[1] = 11;
        num[2] = 33;
        num[3] = 121;
        num[4] = 32;

        for (int contador = 0; contador < 5; contador++) {
            System.out.printf("Array num: %d\n", num[contador]); //contador conta de 0 a 4
        }

        //criar o array e já determinar seus valores:
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; //posições de 0 a 9 respectivamente
             
        System.out.println("");

        //.length busca o tamanho do array
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("Array numeros: %d\n", numeros[contador]);
        }
    }
}
