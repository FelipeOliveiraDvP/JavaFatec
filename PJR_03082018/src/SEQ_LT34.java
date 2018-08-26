
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
public class SEQ_LT34 {
    public static void main(String[] args) {
        String tpl = "";
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para mostrar sua tabuada"));
        
        for (int i = 0; i < 11; i++) {
            tpl += i+" X "+n+" = "+(i*n)+"\n";
        }
        
        JOptionPane.showMessageDialog(null, tpl);
        
    }
}
