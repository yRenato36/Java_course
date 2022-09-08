import javax.swing.JOptionPane;

/* Elabore uma aplicação que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido.
 */

public class Ex04 {
    public static void main(String[] args) {
        int nota = 0;
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota"));
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "Informe uma nota entre 0 e 10");
            }
        } while (nota < 0 || nota > 10);
        JOptionPane.showMessageDialog(null, "Sua nota está entre 0 e 10");
    }
}