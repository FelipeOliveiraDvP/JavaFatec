
import javax.swing.JOptionPane;


/**
 *7.Receba os valores do comprimento, largura e altura de um 
 *  paralelepípedo. Calcule e mostre seu volume.
 * 
 * @author Felipe
 */
public class SEQ_LT07 {
    public static void main(String[] args) {
        double comp,largura,altura,volume;
        
        comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
                
        volume = comp*altura*largura;
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é "+volume);
    }
}