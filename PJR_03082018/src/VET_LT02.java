/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Criar e coletar um vetor [100] inteiro e exibir:
    a.O maior e o menor valor;
    b.A média dos valores
 * @author Felipe
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class VET_LT02 {
     static int vetor[] = new int[100];
    
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
        int maior = 0;
        int menor = 301;
        
        for (int i = 0; i < vetor.length; i++) {            
            tpl       += (i % 10 == 0)?  "\n": " - "+vetor[i]; 
            media     += vetor[i];
            maior     = (vetor[i] > maior)? vetor[i]: maior;
            menor     = (vetor[i] < menor)? vetor[i]: menor;
        }
        media /= vetor.length;
        
        tpl += "\n\nMédia dos valores: "+media;
        tpl += "\nMaior Valor: "+maior;
        tpl += "\nMenor Valor: "+menor;
        
        JOptionPane.showMessageDialog(null, tpl);
    }
}
