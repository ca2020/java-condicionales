/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
pedir una nota de 0 a 10 y mostrarla de forma: insuficiones, suficiente, bien, notable y sobresaliente.
 */
public class E_12 {
    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("digite nota"));
        
        if(nota >=0 && nota<=2){
            JOptionPane.showMessageDialog(null, "insuficiente : " + nota);
        }else{
            if(nota>2 && nota<=4){
                JOptionPane.showMessageDialog(null, "suficiente : " + nota);
            }else{
                if(nota>4 && nota<=6){
                JOptionPane.showMessageDialog(null, "bien: " + nota);
                }else{
                    if(nota>6 && nota<=8){
                        JOptionPane.showMessageDialog(null, "notable : " + nota);
                    }else{
                            if(nota>8 && nota<=10){
                                JOptionPane.showMessageDialog(null, "sobresaliente : " + nota);
                            }else{
                               
                                    JOptionPane.showMessageDialog(null, " eror!! la nota que digitaste es mayor a 10 : " );
           
                            }
                    }
                }
            }
        }
    }
}
