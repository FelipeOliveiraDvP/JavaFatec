
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
public class SEQ_LT43 {
    public static void main(String[] args) {
        double ana=1.10,maria=1.50;
        int anos=0;
        String tpl = "";
     
        
        while (ana < maria) {
                ana += 0.03;
                maria += 0.02;
                anos++;
             
                
                tpl += "Ana: "+String.format("%.2f", ana)+"|  Maria: "+String.format("%.2f", maria)+"|    Anos: "+anos+"\n";
        }
        tpl += "\nForam necessarios "+anos+" para ana ficar maior que maria";
        
        JOptionPane.showMessageDialog(null, tpl);
    }
}
