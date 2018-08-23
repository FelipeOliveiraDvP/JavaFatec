
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT25 {
    
    public static void main(String[] args) {
        int hi, mi, hf, mf;
        
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do Jogo"));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do Jogo"));
        if(validaHora(hi, mi))
        {
            hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do Jogo"));
            mf = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do Jogo"));
        
            if(validaHora(hf, mf))
            {
                calculaTempo(hi,mi,hf,mf);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hora Invalida");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Hora Invalida");
        } 
      
    }

    //função validaHora()
	static boolean validaHora(int h, int m){
		if ((h > 0 && h <=24) && (m >= 0 && m < 60)) {
			return true;
		}else{
			return false;
		}
	}
	//procedimento calculaTempo()
	static void calculaTempo(int hi, int mi, int hf, int mf){
		int ht,mt,tempo;

		tempo = (hf*60+mf)-(hi*60+mi);

		if (tempo <0) {
			tempo += 1440;
			ht = tempo/60;
			mt = tempo%60;			
		}else{
			ht = tempo/60;
			mt = tempo%60;			
		}
		JOptionPane.showMessageDialog(null, "Tempo Total do Jogo: "+ht+"H "+mt+"min");
	}
}
