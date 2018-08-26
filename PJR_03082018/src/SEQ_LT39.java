
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
public class SEQ_LT39 {
    public static void main(String[] args) {
        long casa=1,qtde;
        String tpl = "";
        
        for (qtde = 0;casa <= 64; qtde++ ) {			
        
            if(qtde % 4 == 0){
                tpl += "\n";
            }
            
            tpl += "Casa: "+casa+" numero de grãos: "+totalGraos(qtde)+" | ";
            
            casa++;
        }
        JOptionPane.showMessageDialog(null, tpl);
    }
    //funcao
    static long totalGraos(long qtde){
        return (long) Math.pow(2,qtde);
    }
}
