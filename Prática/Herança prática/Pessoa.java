import java.util.Date; //importa tipo data

//classe pessoa
public class Pessoa extends Dados {
    /*
     * CONTRUTOR PESSOA
     * o construtor é definido como um método cujo
     * nome deve ser o mesmo que a classe e sem indicação
     * do tipo de retorno (nem mesmo void). Ele
     * é unicamente invocado no momento da criação do
     * objeto através do operador new. O retorno do operador
     * new é uma referência para o objeto recém-criado.
     */
    public Pessoa(String _nome, Date _data, int _cpf) {
        super(_nome, _data, _cpf); //com o super, eu puxei os atributos da Classe 
    }
}
