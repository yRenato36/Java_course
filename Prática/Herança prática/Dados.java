import java.util.Date;
public class Dados {
    //atributos = variáveis
    String dNome;
    Date dData_nas;
    int dCpf = 0;
    
    //CONSTRUTOR: sempre receberá o menos nome da classe e serve para instânciar a classe
    public Dados(String _nome, Date _data, int _cpf) {
        this.dNome = _nome;
        this.dData_nas = _data;
        this.dCpf = _cpf;
    }
}
