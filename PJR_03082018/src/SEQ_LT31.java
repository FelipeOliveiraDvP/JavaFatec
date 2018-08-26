
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
public class SEQ_LT31 {
    public static void main(String[] args) {
        String tpl  = "";
        for (int i = 10; i <= 150; i++) {
            tpl += (i % 10 == 0)? "\n" : "  "+i*i;
        }
        JOptionPane.showMessageDialog(null, tpl);
    }
}
