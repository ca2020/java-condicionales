/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
HACER UN PROGRAMA QUE SIMULE UN CAJERO AUTOMATICO CON UN SALDO INICIAL DE 1000 DORLARES, CON EL SIGUIENTE MENU DE OPCIONES:
 */
public class E_13 {
    public static void main(String[] args) {
        int saldoi=1000, saldof;
        
        int opt;
        
        opt = Integer.parseInt(JOptionPane.showInputDialog("\n1.ingresar dinero" + "\n 2.retirar dinero" + "\n 3.salir"));
        
        switch (opt){
            case 1:
                int ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de dinero a ingresar"));
                saldof = saldoi + ingreso;
                JOptionPane.showMessageDialog(null," total de dinero en tu ecuenta es : " + saldof + " suma de saldo inicial " + saldoi
                + " saldo ingresado " + ingreso);
                break;
            case 2:
                int retiro = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de dinero a retirar"));
                if(retiro>saldoi){
                    JOptionPane.showMessageDialog(null, "saldo insuficiente");
                }else{
                    saldof = saldoi - retiro;
                JOptionPane.showMessageDialog(null," total de dinero en tu ecuenta es : " + saldof + " resta de saldo inicial " + saldoi
                + " saldo ingresado a retirar " + retiro);
                }
                break;
            case 3:
                break;
            default:JOptionPane.showMessageDialog(null, "Digitas te opcion incorrecta!!");
        }
    }
}
