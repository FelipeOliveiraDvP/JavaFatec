
import javax.swing.JOptionPane;

/**
 16.Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
 * Calcule o salário que serão as horas trabalhadas x o valor por hora. 
 * Calcule o salário líquido (= Salário Bruto – desconto). 
 * A cada dependente será acrescido R$ 100 no Salário Líquido. 
 * Exiba o salário a receber.
 * 
 * @author Felipe
 */
public class SEQ_LT16 {
    public static void main(String[] args) {
        int horaTrabalhada, totalDependentes;
        double valorHora, desc, salBruto, salLiquido;
        
        horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog("Total de Horas trabalhadas"));
        totalDependentes = Integer.parseInt(JOptionPane.showInputDialog("Total de dependentes"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor da hora"));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do desconto"));
        
        salBruto = calculaSalario(horaTrabalhada, valorHora);
        salLiquido = calculaSalarioLiquido(salBruto, desc, totalDependentes);
        
        JOptionPane.showMessageDialog(null, "Salario a receber: R$"+salLiquido);
    }
    
    public static double calculaSalario(int ht, double vh){
        return ht * vh;
    }
    
    public static double calculaSalarioLiquido(double sal, double desc, int totDep){
    
        desc = sal * (desc/100);
        sal -= desc;
        sal += (totDep * 100);
        
        return sal;
    }
    
}
