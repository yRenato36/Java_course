/* 
 *COMPONENTES DE UM OBJETO:
 * atributo: propriedade, características
 * método: comportamentos, rotinas internas
 * estado: caracteristicas atuais do momento que estou analizando este objeto
 * instanciar: gerar um objeto a partir de uma classe
 */
public class pratica {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        /*
         * chamando atributos da classe caneta e enviando
         * valores para a mesma
         */
        c1.modelo = "canetaAzul";
        c1.cor = "azul";
        c1.ponta = 0.5f;

        // chamando métodoss
        c1.status(); // apresenta os prints dos métodos
        c1.tampar();
        c1.rabiscar();
        

        caneta c2 = new caneta();
        c2.modelo = "canetaVerde";
        c2.cor = "verde";
        c2.ponta = 1.0f;

        c2.status();
        c2.destampar();
        c2.rabiscar();

    }
}
