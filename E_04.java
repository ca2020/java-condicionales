/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 En megaplaza se hace un 20% de descuento a los cliente cuya compra supere los $300 ¿ cual 
 * sera la cantidad que pagara una persona por su compra?.
 */
public class E_04 {
    public static void main(String[] args) {
        int precio;
        float descuento;
        
        precio = Integer.parseInt(JOptionPane.showInputDialog("digite precio"));
        
        if(precio > 300){
            descuento = precio*0.2f;
            JOptionPane.showMessageDialog(null," el precio final es : " + (precio - descuento) + " tienes el descuento del 20%" );
        }else{
            JOptionPane.showMessageDialog(null," el precio final es : " + precio + "sin decuento");
        }
        
    }
}
