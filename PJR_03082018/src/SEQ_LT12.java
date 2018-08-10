
import javax.swing.JOptionPane;


/**
 12.Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * 
 * @author Felipe
 */
public class SEQ_LT12 {
    public static void main(String[] args) {
        int anoNasc, anoAtual;
        
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
               
        JOptionPane.showMessageDialog(null, "Sua idade: "+(anoAtual-anoNasc));
        JOptionPane.showMessageDialog(null, "Sua idade daqui a 17 anos: "+((anoAtual-anoNasc)+17));
    }
}