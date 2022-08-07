import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
        String eNome, eRua, eTipCargo;
        int eCep, eTel;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem-vindo a empresa X\n");
        System.out.println("Digite seu nome completo");
        eNome = ler.nextLine();

        System.out.println("Digite sua rua");
        eRua = ler.nextLine();

        System.out.println("Digite seu CEP");
        eCep = ler.nextInt();

        System.out.println("Digite seu telefone");
        eTel = ler.nextInt();
        
        System.out.println("Digite seu cargo:\ng - Gerente, e - Equipe, r - Recursos Humanos");
        Scanner lerCargo = new Scanner(System.in);
        eTipCargo = lerCargo.nextLine();

        Colaborador c1 = new Colaborador(eNome, eRua, eCep, eTel, eTipCargo);
        
        for(int i = 1; i <= 5; i++){
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
                    System.out.println("Cargo colaborador: " + c1.iTipCargo);
                break;
            }
        }
    }
}
