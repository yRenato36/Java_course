public class Jogador {
    /* metodo contrutor é responsável por iniciar assim quando
    esse classe for instânciada 
    quando se coloca um parâmetro nesse método, 
    é necessário inserir um valor quando ele for instânciado */
    
    //atributos/propriedades de uma classe é a declaração de variáveis

    //o modificador de acesso public significa que é possível utiliza-lo em outro classe
    public int num=0;
    //já o private só é possível utiliza-lo nesta classe
    private int num1=0;
    
    public Jogador(int num){
        //this num in this method recebe a variável public num=0
        this.num=num;
        System.out.printf("Jogador criado %d\n", num);
    }
}
