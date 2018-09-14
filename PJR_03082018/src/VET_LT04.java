
import java.util.Random;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *Criar e coletar em um vetor [30] real e calcular e exibir:
    a.A média do grupo;
    b.A quantidade de notas acima do grupo;
    c.As posições dos valores abaixo da média do grupo.
 * @author Felipe
 */
public class VET_LT04 {
     static double vetor[] = new double[30];
    
    public static void main(String[] args) {
        carregaVetor();
        mostraVetor();
    }
    
    private static void carregaVetor()
    {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Random().nextDouble() * 10;
        }
    }
    
    private static void mostraVetor()
    {
        String tpl = "";
        String tplMenoresNotas = "\nPosição das Menores Notas: \n";
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");
        
        double media = 0;
        int notasAcima = 0;
        int notasAbaixo = 0;
        
        // media e todas as notas
        for (int i = 0; i < vetor.length; i++) {            
            tpl       += "\n["+i+"]"+df.format(vetor[i]); 
            media     += vetor[i];           
        }
        media /= vetor.length;
        //notas acima e abaixo da média
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                notasAcima++;
            }
            if (vetor[i] < media) {
                notasAbaixo++;
                tplMenoresNotas += i+"  ";
            }
        }
        
        
        tpl += "\n\nMédia das notas: "+df.format(media);
        tpl += "\nTotal de notas acima da media: "+notasAcima;
        tpl += tplMenoresNotas;
        
        JOptionPane.showMessageDialog(null, tpl);
    }
}
