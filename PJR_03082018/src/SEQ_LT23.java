
import javax.swing.JOptionPane;


/**
 *
 * @author Lab 102
 */
public class SEQ_LT23 {
    public static void main(String[] args) {
        double nums[] = new double[4];
        String seq = "";
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i + 1)+"° numero"));
            if(i == 2)
            {
                if(!(nums[0] < nums[1] && nums[1] < nums[2]))
                {
                    JOptionPane.showMessageDialog(null,"Os 3 primeiros numeros precisam estar em ordem");
                    break;
                }             
            }       
        }
        
        seq = ordenar(nums);
        
        JOptionPane.showMessageDialog(null,seq);
                      
    }
    
    private static String ordenar(double... nums)
    {
        String ordem = "";
        if(nums[3] > nums[2]){
            ordem = ""+nums[0]+","+nums[1]+","+nums[2]+","+nums[3];
        }else{
            if (nums[3] > nums[1]) {
                ordem = ""+nums[0]+","+nums[1]+","+nums[3]+","+nums[2];
            }else if (nums[3] > nums[0]) {
                ordem = ""+nums[0]+","+nums[3]+","+nums[1]+","+nums[2];
            }else{
                ordem = ""+nums[3]+","+nums[0]+","+nums[1]+","+nums[2];
            }
        }
        
        return ordem;
    }
    
}
