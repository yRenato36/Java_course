public class caneta {
    String modelo, cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.println("[metodo] modelo: " + this.modelo);
        System.out.println("[metodo] Uma caneta: " + this.cor);
        System.out.println("[metodo] Qual o tamanho da ponta? " + this.ponta);
        System.out.println("[metodo] Esta tampada? " + this.tampada);
        System.out.println("[metodo] Carga da caneta: " + this.carga);
    }
    public void rabiscar() {
        if(this.tampada == true)
            System.out.println("\nimpossivel escrever com a caneta tampada\n");
        else
            System.out.println("\nEstou rabiscando....\n");
    }
    public void tampar(){
       /*  para modificar um atributo dentro da própria classe (classe caneta)
        utilize o this.algo... */
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
