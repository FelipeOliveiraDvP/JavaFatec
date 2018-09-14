
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *Criar  e  coletar  valores  inteiros  nos  vetores  VT1[3]  e  VT2[3].  Concatenar 
esses  valores  em  um  3º  vetor  (VT3[6])  e  mostrar  os  seus  dados.  

 * @author Felipe
 */
public class VET_LT03 {
    static int vt1[] = new int[3];
    static int vt2[] = new int[3];
    static int vt3[] = new int[6];
    
    public static void main(String[] args) {
        carregaVetor(vt1);
        carregaVetor(vt2);
        concatenaVetor(vt1, vt2, vt3);
                
        String tpl = "";
        tpl += mostraVetor(vt1);
        tpl += mostraVetor(vt2);
        tpl += mostraVetor(vt3);
        
        JOptionPane.showMessageDialog(null, tpl);
    }
    
    private static void carregaVetor(int vt[])
    {
        for (int i = 0; i < vt.length; i++) {
            vt[i] = new Random().nextInt(10);
        }
    }
    
    private static void concatenaVetor(int vt1[], int vt2[], int vt3[])
    {
        for (int i = 0; i < vt1.length; i++) {
            for (int j = 0; j < vt2.length; j++) {
                vt3[i] = vt1[i];
                vt3[j + vt1.length] = vt2[j];
            }
        }
    }
    
    private static String mostraVetor(int[] vt)
    {
        String tpl = "";
        
        for (int i = 0; i < vt.length; i++) {            
            tpl += vt[i]+"  "; 
        }   
        
        return tpl+"\n";
    }
}
