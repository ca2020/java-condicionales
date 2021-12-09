/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. con meses de 28,30 y 31dias.
* sin años bisiestos.
 */
public class E_10 {
    public static void main(String[] args) {
            int dia,mes,año;
            mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes"));
            dia = Integer.parseInt(JOptionPane.showInputDialog("digite dia"));
            año = Integer.parseInt(JOptionPane.showInputDialog("digite año"));

            
                if (año == 0) {
            JOptionPane.showMessageDialog(null, "no exite el año 0");
        } else {
            if (mes > 13) {
                JOptionPane.showMessageDialog(null, "los meses son 12");
            } else {
                if (mes == 2 && dia >= 29) {
                    JOptionPane.showMessageDialog(null, "esta en año bisiesto o supero mas de 29 dias");
                } else {
                    if (mes == 1 && dia > 31 || dia < 1) {
                        JOptionPane.showMessageDialog(null, "enero tine de 1 a 31 dias");
                    } else {
                        if (mes == 3 && dia > 31 || dia < 1) {
                            JOptionPane.showMessageDialog(null, "marzo tine de 1 a 31 dias");
                        } else {
                            if (mes == 4 && dia > 30 || dia < 1) {
                                JOptionPane.showMessageDialog(null, "abril tine de 1 a 30 dias");
                            } else {
                                if (mes == 5 && dia > 31 || dia < 1) {
                                    JOptionPane.showMessageDialog(null, "mayo tine de 1 a 31 dias");
                                } else {
                                    if (mes == 6 && dia > 30 || dia < 1) {
                                        JOptionPane.showMessageDialog(null, "junio tine de 1 a 30 dias");
                                    } else {
                                        if (mes == 7 && dia > 31 || dia < 1) {
                                            JOptionPane.showMessageDialog(null, "julio tine de 1 a 31 dias");
                                        } else {
                                            if (mes == 8 && dia > 31 || dia < 1) {
                                                JOptionPane.showMessageDialog(null, "agosto tine de 1 a 31 dias");
                                            } else {
                                                if (mes == 9 && dia > 30 || dia < 1) {
                                                    JOptionPane.showMessageDialog(null, "septiembre tine de 1 a 30 dias");
                                                } else {
                                                    if (mes == 10 && dia > 31 || dia < 1) {
                                                        JOptionPane.showMessageDialog(null, "octubre tine de 1 a 31 dias");
                                                    } else {
                                                        if (mes == 11 && dia > 30 || dia < 1) {
                                                            JOptionPane.showMessageDialog(null, "noviembre tine de 1 a 30 dias");
                                                        } else {
                                                            if (mes == 12 && dia > 31 || dia < 1) {
                                                                JOptionPane.showMessageDialog(null, "diciembre tine de 1 a 31 dias");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "fecha : " + mes + " / " + dia + " / " + año);
    }
}
        
        
