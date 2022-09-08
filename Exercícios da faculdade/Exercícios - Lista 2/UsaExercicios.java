/* 
    2. Elabore outra classe chamada UsaExercicios que testa os métodos da
    classe Exercicios. 
*/
public class UsaExercicios {
   public static void main(String[] args) {
        Exercicios.randomNumber(5);
   
        String palavra = "renato da silva";
        palavra.replace(" ", "");
        Exercicios.contVogais(palavra);
        
        
        Exercicios.media(2.5, 2.5, 2.5);

        int[] teste = {2,30,4,5,6,8,12};
        Exercicios.vetorInteiros(teste);
    } 
}
