
import javax.swing.JOptionPane;


/**
 *2.Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * 
 * @author Felipe
 */
public class SEQ_LT02 {
       public static void main(String[] args) {
        double salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario R$ "));
        
        salario *= 1.15;
        JOptionPane.showMessageDialog(null, "O novo salario é R$ "+salario);
        } 
}
