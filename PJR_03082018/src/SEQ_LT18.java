
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT18 {
    public static void main(String[] args) {
        int n1,n2,dif;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
        
        dif = (n1 > n2)? n1 - n2 : n2 - n1;
        
        JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é "+dif);
    }
}
