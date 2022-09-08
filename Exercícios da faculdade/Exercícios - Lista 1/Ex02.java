/* Faça uma classe que peça dois números e imprima em tela o resultado das quatro 
operações matemáticas (+, -, *, /) sobre esses dois números.  
*/

import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite n1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite n2:"));
        if (n2 != 0) {
            JOptionPane.showMessageDialog(null,"Soma: " + (n1 + n2));
            JOptionPane.showMessageDialog(null, "Subtração: " + (n1 - n2));
            JOptionPane.showMessageDialog(null, "Multiplicação: " + (n1 * n2));
            JOptionPane.showMessageDialog(null, "Divisão: " + (n1 / n2));
        } else {
            JOptionPane.showMessageDialog(null, "Digite um valor deferente de 0");
        }

    }
}
