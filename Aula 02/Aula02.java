public class Aula02 {
    public static void main(String[] args) {
        System.out.println("printa e quebra linha");
        //System.out.print("printa mas não quebra linha");
        
        /* printa as coisas com um formato específico */
        System.out.printf("formato string: %s - formato inteiro: %d \n\n", "TESTE", 2022);
        
        String nome = "Renato";
        int num1 = 10, num2 = 20, num3 = 30, result = 0;
        
        result = num1 + num2 + num3;

        System.out.printf("Soma das variáveis = %d, Seu nome: %s", result, nome);
    }
}