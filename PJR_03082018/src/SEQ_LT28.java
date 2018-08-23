
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
public class SEQ_LT28 {
    static double precoAt, mediaMen;
    
    public static void main(String[] args) {
        precoAt = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preco atual do Produto"));
        mediaMen = Double.parseDouble(JOptionPane.showInputDialog("Digite a média de vendas mensais"));
        
        novoPreco();
    }
    
    public static void novoPreco()
    {
        String msg = "Novo Preço: R$ ";
        double novoPreco = 0;
        
        if (mediaMen < 500 && precoAt < 30)
        {			
            novoPreco = precoAt*1.1;
        }
        else if ((mediaMen >= 500 && mediaMen < 1000)&&(precoAt >= 30 && precoAt < 80))
        {			
            novoPreco = precoAt*1.15;
        }
        else if (mediaMen >= 1000 && precoAt >= 80)
        {			
            novoPreco = precoAt*0.95;
        }
        else
        {
            novoPreco = precoAt;
        }
        
        msg += novoPreco;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
