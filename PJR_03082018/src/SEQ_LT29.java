
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class SEQ_LT29 {
    public static void main(String[] args) {
		
		int tipo;
		double valor;
                
                String tpl = "Calcule seu investimento\n--------------------------------------\n";
		tpl += "[1] poupanca\n[2] renda fixa: \n";
		
		tipo = Integer.parseInt(JOptionPane.showInputDialog(tpl+"Tipo da Conta"));
		if (tipo == 1 || tipo == 2) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da aplicação R$"));
			depositar(valor,tipo);
		}else{
			JOptionPane.showMessageDialog(null,"Operação invalida");
		}

	}
	//procedimento
	static void depositar(double valor, int tipo){
		if (tipo == 1) {
			valor *= 1.03;				
		}else{
			valor *= 1.05;			
		}
		JOptionPane.showMessageDialog(null,"Valor R$"+valor);
	}
}
