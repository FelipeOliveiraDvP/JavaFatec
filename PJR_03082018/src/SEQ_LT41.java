
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
public class SEQ_LT41 {
    public static void main(String[] args) {
        int dado1, dado2, soma=0;
        String tpl = "";
        
        for (dado1=1;dado1 <=6;dado1++ ) {
            for (dado2=1;dado2 <= 6;dado2 ++) {

                soma = somaSe(dado1,dado2,7);

                if (soma != 0) {
                    tpl += "("+dado1+" , "+dado2+")\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, tpl);
    }
    //funcao
    static int somaSe(int n1, int n2, int cond){
        return ((n1+n2) == cond)? (n1+n2) : 0;            
    }
}
