
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
public class SEQ_LT40 {
    public static void main(String[] args) {
        int n1, n2;
        String tpl = "";
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero"));
        
        if (n1 > n2) {
            for (int i=n2;i <= n1;i++ ) {

                if (ePrimo(i)) {
                    tpl += i+", ";
                }				
            }
        }else if (n2 > n1) {
            for (int i=n1;i <= n2;i++ ) {

                if (ePrimo(i)) {
                    tpl += i+", ";
                }				
            }
        }else{
            JOptionPane.showMessageDialog(null,"Os numeros são iguais");
        }
        
        JOptionPane.showMessageDialog(null, "Os numeros primos entre "+n1+" e "+n2+" são:\n"+tpl);
    }
    //funcao
    static boolean ePrimo(int n){
            int j,primo=0;

            for (j=1;j <= n;j++ ) {
                    if (n % j == 0) {
                            primo++;
                    }
            }
            if (primo == 2) {
                    return true;
            }

            return false;			
    }
}
