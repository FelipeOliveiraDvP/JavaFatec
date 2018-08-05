
import javax.swing.JOptionPane;


/**
 *1.coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 * 
 * @author Felipe
 */
public class SEQ_LT01 {
    public static void main(String[] args) {
        double lado;
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado de um Quadrardo"));
        
        lado *= lado;
        JOptionPane.showMessageDialog(null, "A area do quadrado é "+lado);
    }
 
}
