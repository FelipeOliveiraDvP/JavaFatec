
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
public class SEQ_LT35 {
    public static void main(String[] args) {
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
    
        JOptionPane.showMessageDialog(null, "A soma dos impares é "+somaImpar(n1, n2));
    }
    
    //funcao 
    static int somaImpar(int n1, int n2){
            int soma=0;

            if (n1 > n2) {
                    while(n2 <= n1){
                            if((n2 % 2) == 1){
                                    soma += n2;					
                            }
                            n2++;
                    }
            }else if (n2 > n1) {
                    while(n1 <= n2){
                            if((n1 % 2) == 1){
                                    soma += n1;					
                            }
                            n1++;
                    }
            }else{
                    if ((n1 % 2 == 1)&&(n2 % 2 == 1)) {
                            soma += (n1+n2);
                    }
            }
            return soma;
    }
}
