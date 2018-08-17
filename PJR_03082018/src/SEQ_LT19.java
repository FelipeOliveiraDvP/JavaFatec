
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT19 {
    public static void main(String[] args) {
        double n1,n2,maior;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero"));
        
        maior = Math.max(n1, n2);
        
        JOptionPane.showMessageDialog(null, "O maior numero é "+maior);
    }
}
