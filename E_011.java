/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import javax.swing.JOptionPane;
/**
CONTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA QUE PUEDE
* REALIZAR LAS CUATRO OPERACIONES ARITMETICAS BASICA(SUMA, RESTA, PRODUCTO Y DIVISION) CON
* VALORES NUMERICOS ENTEROS. EL USUARIO DEBE ESPECIFICAR LA OPERACION CON EL PRIMER CARACTER
* DEL PRIMER PARAMERTRO DE LA LINEA DE COMANDOS: S o s PARA LA SUMA, R o r PARA LA RESTA, P,p,M o m  
* PARA EL PRODUCTO Y D o d PARA LA DIVISION
 */
public class E_011 {
    public static void main(String[] args) {
        int suma,resta,mul,div;
        char operador;
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
        operador = JOptionPane.showInputDialog("S o s PARA LA SUMA, R o r PARA LA RESTA, P,p,M o m  \n" +
"* PARA EL PRODUCTO Y D o d PARA LA DIVISION").charAt(0);
        if(operador == ('r') || operador == ('R')){
            resta = n1-n2;
            JOptionPane.showMessageDialog(null,"la resta es : " + resta);
        }else{
            if(operador == ('s') || operador == ('S')){
                suma = n1+n2;
                JOptionPane.showMessageDialog(null,"la suma es : " + suma);
            }else{
                if(operador == ('P') ||operador == ('p')||operador == ('M') ||operador == ('m')){
                    mul = n1*n2;
                    JOptionPane.showMessageDialog(null,"la multiplicacion es : " + mul);
                }else{
                            if(operador == ('D') || operador == ('d')){
                                if(n2 == 0){
                                     JOptionPane.showMessageDialog(null," el numero 2 debe ser diferente de 0");
                                }else{
                                    div = n1/n2;
                                    JOptionPane.showMessageDialog(null,"la division es : " + div);
                                }
                            }   
                      }
            }
        }
    }
}
