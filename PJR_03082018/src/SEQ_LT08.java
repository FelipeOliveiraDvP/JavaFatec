
import javax.swing.JOptionPane;


/**
 *8.Receba o valor de um depósito em poupança.
 *  Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * 
 * @author Felipe
 */
public class SEQ_LT08 {
    public static void main(String[] args) {
        double deposito,poupanca = 0;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito R$"));
        
        poupanca += deposito;
        
        // apos um mes
        poupanca *= 1.013;
               
        JOptionPane.showMessageDialog(null, "Sua poupança rendeu R$ "+poupanca);
    }
}
