
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Data atual A M D 
 * mostrar idade A M D
 * Considerar Bissestos
 * @author Felipe de Oliveira
 */
public class SEQ_LT30 {
    public static void main(String[] args) {
        int anoNasc, mesNasc, diaNasc;
        int anoAtual, mesAtual, diaAtual;
        
        // Data de nascimento
        diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia de Nascimento\n dd/mm/aaaa"));        
        mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Mes de Nascimento\n "+diaNasc+"/mm/aaaa"));
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano de Nascimento\n "+diaNasc+"/"+mesNasc+"/aaaa"));
        // Data Atual
        diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia Atual\n dd/mm/aaaa"));        
        mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o Mes Atual\n "+diaAtual+"/mm/aaaa"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano Atual\n "+diaAtual+"/"+mesAtual+"/aaaa"));
        // Camada de Validação
        if(validarDiaMes(diaNasc, mesNasc))
        {
            if(validarDiaMes(diaAtual, mesAtual))
            {
                if(anoNasc >= anoAtual)
                {
                    JOptionPane.showMessageDialog(null, "O Ano de nascimento precisa ser maior que o ano atual");
                }
                else
                {
                    // A Logica começa aqui
                    int anos = 0, meses = 0, dias = 0;
                    
                    anos = anoAtual - anoNasc;
                    meses = mesAtual - mesNasc;
                    
                    if(meses < 0)
                    {
                        anos--;
                        meses += 12;
                    }
                    
                    dias = diaAtual - diaNasc;
                    
                    if(dias < 0)
                    {
                        meses--;
                        
                        if(meses < 0)
                        {
                            anos--;
                            meses += 12;
                        }
                        dias += totalDiasMes(meses, anos);
                    }
                    JOptionPane.showMessageDialog(null, "Voce tem "+anos+" Anos, "+meses+" meses e "+dias+" dias");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data Atual Invalida");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Data de Nascimento Invalida");
        }
    }
    // Verifica dia e o mes
    public static boolean validarDiaMes(int dia, int mes)
    {
        return (dia > 0 && dia <= 31 && mes > 0 && mes <= 12);
    }
    // retorna os dias do ano
    public static int totalDiasAno(int ano)
    {
        int totDiasAno = 0;
        
        if(ano % 4 == 0)
        {
            if (ano % 100 == 0)
            {
                totDiasAno = 365;
            }
            else
            {
                totDiasAno = 366; // bisexto
            }
        }
        else if(ano % 400 == 0)
        {
            //bissexto
            totDiasAno = 366;
        }
        else
        {
            // não bissexto
            totDiasAno = 365;
        }
        return totDiasAno;
    }
    // Retorna o Total de dias do mes
    public static int totalDiasMes(int mes, int ano)
    {
        int totDiasMes = 0;
        
        if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
        {
            totDiasMes = 31;
        }
        else if (mes == 2)
        {
            if(totalDiasAno(ano) == 366)
            {
                totDiasMes = 29;
            }
            else
            {
                totDiasMes = 28;
            }
        }
        else
        {
            totDiasMes = 30;
        }        
        
        return totDiasMes;
    }
    
}
