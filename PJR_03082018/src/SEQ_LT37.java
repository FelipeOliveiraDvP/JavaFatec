
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
public class SEQ_LT37 {
    public static void main(String[] args) {
        int n;
        String tpl = "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        
        for (int i = 0; i < n; i++) {
            tpl += fibonacci(i)+" ";
        }
        
        JOptionPane.showMessageDialog(null, tpl, "Sequencia de Fibonacci", JOptionPane.WARNING_MESSAGE);
    }
    //funcao
    static int fibonacci(int n){
            int i,atual=0,anterior=0;

            for (i=1;i <= n; i++ ) {

                    if (i == 1) {
                            atual = 1;
                            anterior = 0;			
                    }else{
                            atual += anterior;
                            anterior = atual -anterior;
                    }			
            }
            return atual;
    }
}
