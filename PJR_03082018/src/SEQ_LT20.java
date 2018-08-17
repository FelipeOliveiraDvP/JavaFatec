
import javax.swing.JOptionPane;


/**
 *5.Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
 *  Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 * 
 * @author Felipe
 */
public class SEQ_LT20 {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de C"));
        
        delta = b*b - (4*a*c);
        
        if(a == 0)
        {
            JOptionPane.showMessageDialog(null, "A precisa ser diferente de 0");
        }
        else
        {
            if(delta > 0)
            {
                x1 = -(b+Math.sqrt(delta))/2*a;
                x2 = -(b-Math.sqrt(delta))/2*a;
        
                JOptionPane.showMessageDialog(null, "Valor de x1: "+x1+"\nValor de x2: "+x2);
            }
            else
            {
                if (delta == 0)
                {
                    x1 = -(b+Math.sqrt(delta))/2*a;
                    x2 = -(b-Math.sqrt(delta))/2*a;

                    JOptionPane.showMessageDialog(null, "Valor de x1: "+x1+"\nValor de x2: "+x2);
                } 
                else
                {
                    if(delta < 0)
                    {
                        JOptionPane.showMessageDialog(null, "Delta não pertence aos reais");
                    }
                }
            }
        }
        
        
        
    }
}
