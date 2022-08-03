/* Coinceito de Herança: uma classe que herda caracteristicas
 * de uma outra classe
 */

public class Aula13 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Celta");
        Carro c2 = new Carro("Focus");
        
        CarroCombate cc1 = new CarroCombate("tanque", 100);
        CarroCombate cc2 = new CarroCombate("nave", 50);
        c1.setLigado(true);
        
        c1.info();
        c2.info();
        cc1.info();
        cc2.info();
    }
}