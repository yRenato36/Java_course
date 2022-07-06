public class Aula03 {
    public static void main(String[] args)
    {
        int nota = 10;
        //int faltas = 23;
        //int maxFaltas = 15;
        int media = 7;
        String result;

        //operadores ternários: condição ? valor verdareiro : valor falso
        result = (nota >= media ? "aprovado" : "reprovado");
        System.out.println("resultado: " + result);
    }
}