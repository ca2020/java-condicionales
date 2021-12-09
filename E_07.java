/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
pedir tres numero y mostrarlos ordenados de mayor a menor
 */
public class E_07 {
    public static void main(String[] args) {
        int n1,n2,n3;
        
      n1 = Integer.parseInt(JOptionPane.showInputDialog("digite primer numero"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("digite segundo numero"));
      n3 = Integer.parseInt(JOptionPane.showInputDialog("digite tercer numero"));
      
      if(n1>n2 && n2>n3 ){
          JOptionPane.showMessageDialog(null," los numeros : " + n1 + " " + n2 + " " + " " + n3 );
      }else{
          if(n3>n2 && n2>n1){
              JOptionPane.showMessageDialog(null," los numeros : " + n3 +  " "  + n2 + " " + n1 );
          }else{
              if(n2>n1 && n1>n3){
                  JOptionPane.showMessageDialog(null," los numeros : " + n2+ " " + n1 + " " + n3 );
              }else{
                  if(n2>n3 && n3>n1){
                      JOptionPane.showMessageDialog(null," los numeros : " + n2 + " " + n3 + " " + n1 );
                  }else{
                      if(n1>n3 && n3>n2){
                          JOptionPane.showMessageDialog(null," los numeros : " + n1 + " " + n3 + " " + n2 );
                      }else{
                          if(n3>n1 && n1>n2){
                              JOptionPane.showMessageDialog(null," los numeros : " + n3 + " " + n1 + " " + n2 );
                          }
                      }
                  }
              }
          }
      }
    }  
   
}
