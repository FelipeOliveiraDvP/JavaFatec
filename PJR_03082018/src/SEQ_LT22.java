
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT22 {
    public static void main(String[] args) {
        int n1,n2;
        String ordem;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
        
        ordem = (n1 == n2)? "Os Numeros não Podem ser iguais ":
                            "1°: "+Math.min(n1, n2)+"\n2°: "+Math.max(n1, n2);
        
        JOptionPane.showMessageDialog(null, ordem);
    }
}