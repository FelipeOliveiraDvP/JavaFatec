/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *  a.A média dos valores entre 10 e 200;
    b.A soma dos números ímpares.
 * @author Felipe
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class VET_LT01 {
    static int vetor[] = new int[50];
    
    public static void main(String[] args) {
        carregaVetor();
        mostraVetor();
    }
    
    private static void carregaVetor()
    {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Random().nextInt(300);
        }
    }
    
    private static void mostraVetor()
    {
        String tpl = "";
        double media = 0;
        int somaImpar = 0;
        
        for (int i = 0; i < vetor.length; i++) {            
            tpl       += (i % 10 == 0)?  "\n": " - "+vetor[i]; 
            media     += (vetor[i] > 10 && vetor[i] < 200)? vetor[i]:0;
            somaImpar += (vetor[i] % 2 == 1)? vetor[i]: 0;
        }
        
        tpl += "\n\nMédia entre 10 e 200: "+media;
        tpl += "\nsoma dos impares: "+somaImpar;
        
        JOptionPane.showMessageDialog(null, tpl);
    }
    
}
