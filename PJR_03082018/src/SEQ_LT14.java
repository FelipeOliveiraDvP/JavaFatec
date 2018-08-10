
import javax.swing.JOptionPane;


/**
 14.Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * 
 * @author Felipe
 */
public class SEQ_LT14 {
    public static void main(String[] args) {
        int ang1,ang2,ang3; 
                
        ang1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º angulo de um triangulo"));
        ang2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º angulo de um triangulo"));
        
        ang3 = 180 - (ang1 + ang2);
                
        JOptionPane.showMessageDialog(null, "O 3º angulo mede "+ang3+"º ");
    }
}