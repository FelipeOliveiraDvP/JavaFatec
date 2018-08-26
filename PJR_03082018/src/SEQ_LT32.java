
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
public class SEQ_LT32 {
    public static void main(String[] args) {
        double n;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero para saber o seu fatorial"));
        
        JOptionPane.showMessageDialog(null, "O fatorial do numero é "+fatorial(n));
    }
    
    public static double fatorial(double n)
    {
        return (n == 1)? n : n * fatorial(n - 1);
    }
}
