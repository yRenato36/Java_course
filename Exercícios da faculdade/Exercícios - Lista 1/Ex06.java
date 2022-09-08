import javax.swing.JOptionPane;

/*  
Elabore uma aplicação que solicite a entrada de 10 números inteiros, calcule 
e mostre a quantidade de números pares e a quantidade de números impares.
 */

public class Ex06 {
    public static void main(String[] args) {
        int contPar = 0, contImpar = 0;

        for(int n =0; n < 10; n++ ) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            if(valor % 2 == 0){
                contPar++;
            }else {
                contImpar++;
            }
        }
        JOptionPane.showMessageDialog(null, "Quantidade de números pares:  " + contPar + "\n" + "Quantidade de números impares: " + contImpar);
    }
}
