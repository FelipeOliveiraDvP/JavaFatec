
import javax.swing.JOptionPane;

/**
 17.Calcule a quantidade de litros gastos em uma viagem, 
 * sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * 
 * @author Felipe
 */
public class SEQ_LT17 {
    public static void main(String[] args) {
        int qtdLitros,tempoPercurso;
        double velMedia, distancia;
        
        tempoPercurso = Integer.parseInt(JOptionPane.showInputDialog("Informe o Tempo do Percurso"));
        velMedia = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade media (em Km/h)"));
        
        distancia = (int)velMedia * tempoPercurso;
        qtdLitros = (int) (distancia % 12);
        
        JOptionPane.showMessageDialog(null, "O veiculo gasta "+qtdLitros+" Litros por Km");
    }
}
