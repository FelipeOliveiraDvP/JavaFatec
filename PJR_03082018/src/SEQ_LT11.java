
import javax.swing.JOptionPane;


/**
 11.Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 * 
 * @author Felipe
 */
public class SEQ_LT11 {
    public static void main(String[] args) {
        double raio, circ;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferencia"));
        
        circ = 2*Math.PI*raio;
        
        JOptionPane.showMessageDialog(null, "A circunferencia do circulo é "+circ);
    }
}