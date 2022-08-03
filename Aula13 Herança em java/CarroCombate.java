                    //chamando a classe base/superclasse
public class CarroCombate extends Carro{
    private final int Max_Armamento = 100;
    private final int Min_Armamento = 0;
    private int qtdArmamento;

                    //definindo atributos à este método
    public CarroCombate(String nome, int blindagem){
        super(nome); // esse super serve para chamar o construtor da classe base
        super.setArmamento(true); //utilize super para chamar métodos ou atributos da classe base
        super.setBlindagem(blindagem);
        this.qtdArmamento = 100;
    }

    //declarando método da subclasse CarroCombate
    public void setQtdArmamento(int armamento) {
        this.qtdArmamento = armamento;
        if(this.qtdArmamento > Max_Armamento){
            this.qtdArmamento = Max_Armamento;
        } 
        if(this.qtdArmamento < Min_Armamento){
            this.qtdArmamento = Min_Armamento;
        } 
    }
    public int getQtdArmamento() {
        return  this.qtdArmamento;
    }
    public void atirar() {
        if(this.qtdArmamento > Min_Armamento){
            setQtdArmamento(-1);
        } else {
            System.out.println("Sem armamento");
        }
    }
    public void info(){
        super.info();
        System.out.printf("Quantidade Armamento.....:%d%n",this.qtdArmamento);
    }
}
