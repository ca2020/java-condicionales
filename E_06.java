/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
hacer un programa que tome dos numeros y diga si ambos son pares o impares
 */
public class E_06 {
    public static void main(String[] args) {
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite segundo numero"));
        
        
             if(n1%2==0 && n2%2==0){
                 JOptionPane.showMessageDialog(null," el numero " + n1 + " es par" + " el numero " + n2 + " es par");
             }else{
                 if(n1%2!=0&&n2%2!=0){
                     JOptionPane.showMessageDialog(null," el numero " + n1 + " es impar" + " el numero " + n2 + " es impar");
                 }else{
                     if(n1%2!=0 && n2%2==0){
                         JOptionPane.showMessageDialog(null," el numero " + n1 + " es impar" + " el numero " + n2 + " es par");
                     }else{
                         if(n2%2==0 && n1%2!=0){
                             JOptionPane.showMessageDialog(null," el numero " + n2 + " es par" + " el numero " + n1 + " es impar");
                         }
                     }
                 }
             }
    }
}
