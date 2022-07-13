
//essa classe faz as restrições de valores
public class ExerAula12_part2 {
    // serve para receber a qtd de vidas da outra classe
    int vidasNessaClasse = 0, numVidasAqui = 0;

    // recebe o int da variável vidas da main class
    public int qtdVidas(int vidas) {
        this.vidasNessaClasse = vidas;
        return vidasNessaClasse;
    }

    // private final int maxVidas = 10;
    public int addVidas(int vidas1) {
        this.numVidasAqui = vidas1;        
        if (this.numVidasAqui == +1 ) {
            this.vidasNessaClasse++;
            System.out.printf("Você Adicionou uma vida\nTotal de vidas: %d", vidasNessaClasse);
        } else if (this.numVidasAqui == -1) {
            this.vidasNessaClasse--;
            System.out.printf("Você Removeu uma vida\nTotal de vidas: %d", vidasNessaClasse);
        }
        return vidasNessaClasse;
    }
}
