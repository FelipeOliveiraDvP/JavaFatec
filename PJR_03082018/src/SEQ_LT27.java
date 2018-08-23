
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
public class SEQ_LT27 {
    public static void main(String[] args) {
        double nVoltas, extensao, tempo;
        
        nVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de voltas"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração da prova(em minutos)"));
        
        calculaVelocidade(nVoltas, extensao, tempo);
    }
    
    public static void calculaVelocidade(double nVoltas, double extensao, double tempo)
    {
        double distancia,velMedia;

	distancia = (nVoltas*extensao)/1000;
	velMedia = distancia /(tempo/60);
        
        JOptionPane.showMessageDialog(null, "A velocidade média é "+velMedia+"Km/h");
    }
}
