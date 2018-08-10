
import javax.swing.JOptionPane;


/**
 9.Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * 
 * @author Felipe
 */
public class SEQ_LT09 {
    public static void main(String[] args) {
        int n1 = 0,n2 = 0, quad;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n2"));
        
        quad = (n1*n1) + (n2*n2);
        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos numeros é "+quad);
    }
}
