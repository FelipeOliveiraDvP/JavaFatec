
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class SEQ_LT26 {
    public static void main(String[] args) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Numero"));
        
        multiplo(n1, n2);
    }
    
    private static void multiplo(int n1, int n2)
    {
        if(n1 > n2)
        {
            JOptionPane.showMessageDialog(null, ((n1 % n2 == 0)? n1+" é multiplo de "+n2:
                                                                 n1+" não é multiplo de "+n2));
        }
        else
        {
            JOptionPane.showMessageDialog(null, ((n2 % n1 == 0)? n2+" é multiplo de "+n1:
                                                                 n2+" não é multiplo de "+n1));
        }
    }
}
