//Caminho das classes: Escola > Pessoa > Dados
import java.util.Date;

public class Escola {
    public static void main(String[] args) {
        Date _data = new Date(); //esse objeto data busca automaticamente a data do sistema 
        Pessoa p1 = new Pessoa("renato", _data, 1234);
                        
                    //variáveis puxadas da classe Dados 
        System.out.println("Nome da p1: " + p1.dNome); 
        System.out.println("Data da p1: " + p1.dData_nas);
        System.out.println("Cpf da p1: " + p1.dCpf);
    }
}
