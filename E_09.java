/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
pedir el dia, mes y año de una fecha e indicar si la fecha es correcta, suponiendo que todos los meses
* son de 30 dias.
 */
public class E_09 {
    public static void main(String[] args) {
     
        int dia,año,mes;
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("digite dia"));
        año = Integer.parseInt(JOptionPane.showInputDialog("digite año"));
        
        if(dia>30){
            JOptionPane.showMessageDialog(null, "los meses no tinen mas de 30 dias");
        }else{
            if(año ==0){
                JOptionPane.showMessageDialog(null, "no exite el año 0");
            }else{
                if(mes>13){
                    JOptionPane.showMessageDialog(null, "los meses son 12");
                }
            }
            JOptionPane.showMessageDialog(null, "fecha : " + mes +" / "+ dia +" / "+ año);
        }
        
    }
}
