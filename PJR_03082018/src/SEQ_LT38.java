
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
public class SEQ_LT38 {
    public static void main(String[] args) {
        int maior = 0, menor = 9999, n, i= 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            
            maior = Math.max(maior, n);
            menor = Math.min(menor, n);
            
            i++;
        } while (i < 100);
        JOptionPane.showMessageDialog(null, "Maior Valor Digitado: "+maior+"\nMenor Valor Digitado: "+menor);
    }
}
