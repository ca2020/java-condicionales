/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
 Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * si trabaja 40 horas o menos se le paga $16 por hora
 * si trabaja mas de 40 horas se le paga $16 por cada una de las primera 40 horas y $20 por
 * cada hora extra.
 */
public class E_05 {
    public static void main(String[] args) {
        int horast, precioh=16, horasex=20;
        
        horast = Integer.parseInt(JOptionPane.showInputDialog("digite numero de horas trabajadas "));
        
        if( horast <= 40){
            JOptionPane.showMessageDialog(null, " su salario semanal es : " + horast*precioh );
        }else{
            if(horast >=40){
                int total = (horast*precioh)+(horast-40)*horasex ;
                JOptionPane.showMessageDialog(null,"su salario semanal es : " +total);
            }
        }
    }
}
