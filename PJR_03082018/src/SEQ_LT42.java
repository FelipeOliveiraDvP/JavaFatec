
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
public class SEQ_LT42 {
    public static void main(String[] args) {
       double base, soma = 0;
       String tpl = "";
       
        for (int i = 0; i < 50; i++) {
            base = (i*2-1);
            soma += divisao(i,base);
            
            tpl += i+"/"+base+"  soma: "+soma+"\n";
        }
        JOptionPane.showMessageDialog(null, tpl);
    }
    //funcao
    static double divisao(double n, double base){
            return (n/base);
    }
}
