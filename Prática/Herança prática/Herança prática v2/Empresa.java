import javax.crypto.spec.DESKeySpec;
import javax.swing.text.AbstractDocument.BranchElement;

public class Empresa {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador("Jeferson", "Rua 11", 2131, 231);
        
        for(int i = 1; i <= 4; i++){
            switch(i) {
                case 1:
                    System.out.println("Nome colaborador: " + c1.iNome);
                break;
                case 2:
                    System.out.println("Rua colaborador: " + c1.iRua);
                break;
                case 3:
                    System.out.println("Cep colaborador: " + c1.iCep);
                break;
                case 4:
                    System.out.println("Telefone colaborador: " + c1.iTel);
                break;
                default:
                System.out.println(" [ERROR] ");
            }
        }
    }
}
