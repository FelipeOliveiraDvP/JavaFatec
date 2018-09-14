
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *  Criar  e  coletar  em  um  vetor  [20]  com  números  aleatórios.  Classificar  este 
    vetor em ordem crescente e mostre os dados.
 * @author Felipe
 */
public class VET_LT06 {
    static int[] vetor = new int[20];
    
    public static void main(String[] args) {
        carregaVetor();
        mostraVetor();        
        sort();
        mostraVetor();
    }
    
    private static void carregaVetor()
    {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Random().nextInt(50);
        }
    }
    
    private static void sort()
    {
        int aux;
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
    
    private static void mostraVetor()
    {
        String tpl = "";
        
        for (int i = 0; i < vetor.length; i++) {
            tpl += vetor[i]+"  ";
        }
        
        JOptionPane.showMessageDialog(null, tpl);
    }
}
