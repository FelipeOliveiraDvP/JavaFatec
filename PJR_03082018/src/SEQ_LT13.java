
import javax.swing.JOptionPane;


/**
 13.Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * 
 * @author Felipe
 */
public class SEQ_LT13 {
    public static void main(String[] args) {
        int qtdAlimento; 
        int diasRestantes;
        
        qtdAlimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimento em Kg"));
        
        qtdAlimento *= 1000;
        diasRestantes = (int)qtdAlimento/50;
                
        JOptionPane.showMessageDialog(null, "O alimento ira durar "+diasRestantes+" dias.");
    }
}