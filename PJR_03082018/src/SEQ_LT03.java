
import javax.swing.JOptionPane;


/**
 *3.Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 * 
 * @author Felipe
 */
public class SEQ_LT03 {
    public static void main(String[] args) {
    double base,altura,area;
    base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triangulo"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triangulo"));

    area = base * altura;
    JOptionPane.showMessageDialog(null, "A area do triangulo é "+area);
    }  
}
