
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
public class SEQ_LT36 {
    
    public static void main(String[] args) {
        double n, soma = 0;
        String tpl = "";
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um Numero"));
        
        for (int i = 1;i <= n;i++) {
            tpl += "1/"+i+"!, ";
            soma += (1/fatorial(i));	
	}
        
        JOptionPane.showMessageDialog(null, "A soma da serie "+tpl+"\né "+soma);
    }
    
     public static double fatorial(double n)
    {
        return (n == 1)? n : n * fatorial(n - 1);
    }
}
