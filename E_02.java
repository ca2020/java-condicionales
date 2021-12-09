/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 * pedir dos numeros y decir cual es mayor o si son iguales

*/
public class E_02 {
    public static void main(String[] args) {
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite primer numero "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite segundo numero "));
        
        if(n1 < n2){
            JOptionPane.showMessageDialog(null, "El numero " + n1 + " es menor que el numero " + n2);
        }else{
            if(n1 > n2){
                JOptionPane.showMessageDialog(null, "El numero " + n1 + " es mayor que el numero " + n2);
            }else{
                if(n1 == n2){
                    JOptionPane.showMessageDialog(null, "El numero " + n1 + " es iguale al numero " + n2);
                }
            }
        }
            
        
    }
}
