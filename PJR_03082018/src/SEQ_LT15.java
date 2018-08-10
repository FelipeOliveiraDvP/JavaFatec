
import javax.swing.JOptionPane;


/**
 15.Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * 
 * @author Felipe
 */
public class SEQ_LT15 {
    public static void main(String[] args) {
        int catetoA,catetoB,hip; 
                
        catetoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º cateto de um triangulo"));
        catetoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º cateto de um triangulo"));
        
        hip = (catetoA*catetoA) + (catetoB*catetoB);
        hip = (int) Math.sqrt(hip);
                
        JOptionPane.showMessageDialog(null, "A hipotenusa é "+hip);
    }
}