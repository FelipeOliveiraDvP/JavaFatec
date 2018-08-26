/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe
 */
public class SEQ_LT45 {
    public static void main(String[] args) {
        int numerador,denominador;
        double soma;

        numerador = 1;
        denominador = (numerador *numerador);
        soma = 0;

        while(numerador <= 15){
            if (numerador % 2 == 0) {
                soma = soma - (numerador/denominador);
            }else{
                soma = soma + (numerador/denominador);
            }
            
            denominador = (numerador *numerador);
            numerador++;
        }
        System.out.println("Soma: "+soma);
    }
}
