
import javax.swing.JOptionPane;



/**
 *4.Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * 
 * @author Felipe
 */
public class SEQ_LT04 {
  public static void main(String[] args) {
    double celsius,faren;
    celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura em C° "));
    
    faren = (9 * celsius + 160)/5;
    JOptionPane.showMessageDialog(null, "A temperatura em F° é "+faren);
    }    
}
