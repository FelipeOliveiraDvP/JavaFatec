
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
public class SEQ_LT44 {
    public static void main(String[] args) {
        long base, expoente;
        
        base = Long.parseLong(JOptionPane.showInputDialog("Informe a base da exponenciação"));
        expoente = Long.parseLong(JOptionPane.showInputDialog("Informe o expoente"));
        
        JOptionPane.showMessageDialog(null, base+"^"+expoente+" = "+pow(base, expoente));
    }
    //funcao
    static double pow(long base, long expoente){
        long i;
        double potencia=1;

        if (expoente > 0) {
                for (i=0;i < expoente;i++) {
                        potencia *= base;
                }
        }else if (expoente < 0) {
                for (i=0;i > expoente;i--) {
                        potencia /= base;
                }
        }else{
                return 1;
        }
        return potencia;
    }
}
