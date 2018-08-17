
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT25 {
    
    public static void main(String[] args) {
        int hi, mi, hf, mf;
        
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do Jogo"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do Jogo"));
        
        hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do Jogo"));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto do Jogo"));
        
        calculaIntervalo(hi, mi, hf, mf);
    }

    private static void calculaIntervalo(int hi, int mi, int hf, int mf) {
        
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
