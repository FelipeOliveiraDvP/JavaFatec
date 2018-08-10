
import javax.swing.JOptionPane;


/**
 10.Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * 
 * @author Felipe
 */
public class SEQ_LT10 {
    public static void main(String[] args) {
        double n1 = 0,n2 = 0, dif;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de n1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de n2"));
        
        dif = n1 - n2;
        JOptionPane.showMessageDialog(null, "A diferença dos numeros é "+dif);
    }
}