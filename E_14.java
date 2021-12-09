/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
hacer un programa que pase de kg a otra unidad de madeida de masa, mostrar en pantalla un menu con las opciones posible.
 */
public class E_14 {
    public static void main(String[] args) {
        int  opt;
        float numero;
        opt = Integer.parseInt(JOptionPane.showInputDialog("\n 1. hectogramo" + "\n 2. decagramo" + "\n 3. gramo" + "\n 4. salir"));
        
        switch(opt){
            case 1:
                numero = Float.parseFloat(JOptionPane.showInputDialog("digite el peso kg"));
                float hg = numero*(10/1);
                JOptionPane.showMessageDialog(null, " el peso de kg es : " + numero + " y el peso en hectogramos es  : " + hg );
                break;
            case 2:
                numero = Float.parseFloat(JOptionPane.showInputDialog("digite el peso kg"));
                float dag = numero*(100/1);
                JOptionPane.showMessageDialog(null, " el peso de kg es : " + numero + " y el peso en hectogramos es  : " + dag );
                break;
            case 3:
                numero = Float.parseFloat(JOptionPane.showInputDialog("digite el peso kg"));
                float g = numero*(1000/1);
                JOptionPane.showMessageDialog(null, " el peso de kg es : " + numero + " y el peso en hectogramos es  : " + g );
                break;
            case 4:
                break;
            default:JOptionPane.showMessageDialog(null, "escogiste opcion equivocada!!");
        }
        
        
    }
}
