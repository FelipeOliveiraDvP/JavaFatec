
import javax.swing.JOptionPane;


/**
 *6.Receba os valores em x e y. Efetua a troca de 
 *  seus valores e mostre seus conteúdos.
 * 
 * @author Felipe
 */
public class SEQ_LT06 {
    public static void main(String[] args) {
        double x,y,aux;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de y"));
                
        aux = x;
        x = y;
        y = aux;
        JOptionPane.showMessageDialog(null, "Valor de x: "+x+"\nValor de y: "+y);
    }
}
