import javax.swing.JOptionPane;

/* 
Elabore uma aplicação que leia um nome de usuário e a sua senha e NÃO aceite 
a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando 
a pedir as informações.
 */

public class Ex05 {
    public static void main(String[] args) {
        String nome, senha;
        do {
            nome = JOptionPane.showInputDialog(null, "Digite seu nome de usuário: ");
            senha = JOptionPane.showInputDialog(null, "Digite sua senha de usuário: ");
            if(nome.equals(senha)){
                JOptionPane.showMessageDialog(null, "O nome de usuário e senha são iguais, digite novamente ");
            }

        } while (nome.equals(senha));
            JOptionPane.showMessageDialog(null, "Entrou");
    }
}