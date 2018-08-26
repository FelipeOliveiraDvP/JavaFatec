
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
public class SEQ_LT33 {
    public static void main(String[] args) {
        double n, soma = 0;
        String tpl = "";
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número para calcular a serie"));
        
        for (int i = 1; i <= n; i++) {
            tpl += "1/"+i+" , ";
            soma += divisao(i);
        }
        
        JOptionPane.showMessageDialog(null, "A soma da série "+tpl+"\n é "+soma);
        
    }
    
    static double divisao(double i){
    	return (1/i);
    }
}
