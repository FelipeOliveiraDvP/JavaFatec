
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *  A  partir  do  exercício  6  (vetor  classificado)  solicitar  um  valor  qualquer  e 
    verificar a sua existência no vetor (utilizar pesquisa binária).
 * @author Felipe
 */
public class VET_LT07 {
     static int[] vetor = new int[20];
    
    public static void main(String[] args) {
        carregaVetor();                
        sort();
        buscarValor();
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

    private static void buscarValor() {
        int valor;        
        boolean achou;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para pesquisar: "));
        
        int meio;   
        int inicio = 0;   
        int fim = vetor.length-1;   
        while (inicio <= fim) {   
                 meio = (inicio + fim)/2;   
                 if (valor == vetor[meio])   
                          achou = true;   
                 if (valor < vetor[meio])   
                          fim = meio - 1;   
                 else   
                          inicio = meio + 1;   
        }        
        achou = false;
        
        JOptionPane.showMessageDialog(null, (achou)?"Valor encontrado":"Não achou");
    }
}
