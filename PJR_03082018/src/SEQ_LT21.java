
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT21 {
    public static void main(String[] args) {
        double notas[] = new double[4];
        double media = 0;
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i + 1)+"° nota"));
            media += notas[i];
        }
        
        media /= notas.length;
        
        JOptionPane.showMessageDialog(null, "A media final foi "+media);
        
        if(media >= 6)
        {
            JOptionPane.showMessageDialog(null, "Aluno APROVADO");
        }
        else if(media >= 3 && media < 6)
        {
            JOptionPane.showMessageDialog(null, "Aluno EXAME");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Aluno REPROVADO");
        }
    }
}
