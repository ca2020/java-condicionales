/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
programar que lea un caracter por teclado y compruebe si es una letra mayuscula
 */
public class E_03 {
    
    public static void main(String[] args) {
        char caracter;
        
        caracter = JOptionPane.showInputDialog("digite un letra").charAt(0);
            //Character.isUpperCase(caracter) = para saber si una letra es mayuscula
        if(Character.isUpperCase(caracter)){
            JOptionPane.showMessageDialog(null, (" La letra " + caracter + " es mayuscula"));
        }else{
            JOptionPane.showMessageDialog(null, (" La letra " + caracter + " es minuscula"));
        }
    }
}
