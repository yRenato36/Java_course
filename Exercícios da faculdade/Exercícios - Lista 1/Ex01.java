import javax.swing.JOptionPane;

/* Faça uma classe que peça a temperatura em graus Farenheit, transforme e mostre a 
temperatura em graus Celsius. 
o C = (5 * (F-32) / 9). 
 */

public class Ex01 {
    public static void main(String[] args) {
        float farenheit = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite uma temperatura em Farenheit: "));
        float celsius = (5 * (farenheit-32) / 9);

        JOptionPane.showMessageDialog(null, "valor em celsius: " +celsius);
    }
}
