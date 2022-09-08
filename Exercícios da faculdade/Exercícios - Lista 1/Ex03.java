/* 
Faça uma aplicação para receber um número qualquer e informar na tela se é par ou ímpar.  
*/

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite um número"));

        if(n1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Numero par");
        }
        else {
            JOptionPane.showMessageDialog(null, "Numero ímpar");
        }
    }    
}
