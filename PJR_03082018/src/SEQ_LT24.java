
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT24 {
    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        if(n % 2 == 0 && n % 3 == 0)
        {
            JOptionPane.showMessageDialog(null,"O numero é divisivel por 2 e 3");
        }
        else 
        {
            if (n % 2 == 0)
            {
                JOptionPane.showMessageDialog(null,"O numero é divisivel por 2");
            }
            else if (n % 3 == 0)
            {
                JOptionPane.showMessageDialog(null,"O numero é divisivel por 3");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"O numero não é divisivel por 2 e 3");
            }
        }
    }
}
