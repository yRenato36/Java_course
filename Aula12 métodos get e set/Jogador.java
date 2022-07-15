public class Jogador {
    private int num = 0;
    private int vidas = 0;

    public Jogador(int num){
        this.num = num;
        //this.vidas = 20;
        System.out.printf("Jogador %d criado \n", num);
    }
    //método get tem a função de obter valores de uma variável em uma classe ou outra classe
    public int getVidas(){
        //return this variable(vidas)
        return this.vidas;
    }
    private final int maxVidas = 10;
    public void setVidas(int vidas){ //this utiliza a variável desta classe
        if(vidas > maxVidas) {
            this.vidas = maxVidas;
            System.out.println("vidas do jogador > 10, atribuindo 10");
        } else if(vidas <= 0) {
            this.vidas = 0;
            System.out.println("vidas do jogador <= 0, atribuindo 0");
        }else{
            this.vidas = vidas;
        }
    }
    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }
}
