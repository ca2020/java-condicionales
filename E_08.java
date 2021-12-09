/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
 */
public class E_08 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        
        if(numero<10){
            JOptionPane.showMessageDialog(null, "el numero tiene una cifra");
        }else{
            if(numero>9 && numero<100){
                JOptionPane.showMessageDialog(null, "el numero tiene 2 cifras");
            }else{
                if(numero>99 && numero<1000){
                    JOptionPane.showMessageDialog(null, "el numero tiene 3 cifras");
                }else{
                    if(numero>999 && numero<10000){
                        JOptionPane.showMessageDialog(null, "el numero tiene 4 cifras");
                    }else{
                        if(numero>9999 && numero<100000){
                            JOptionPane.showMessageDialog(null, "el numero tiene 5 cifras");
                        }else{
                            JOptionPane.showMessageDialog(null, "el numero tiene mas de 5 cifras, debe ser de 1 a 5 cifras");
                        }
                    }
                }
            }
        }
        
    }
}
