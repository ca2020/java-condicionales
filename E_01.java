/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author broli
 */
public class E_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("digite numero");
        numero = sc.nextInt();
        
        if(numero%10 ==0 ){
            System.out.println("El numero " + numero + " es multiplo de 10");
        }else{
            System.out.println("El numero " + numero + " no es multiplo de 10");
        }
    }
    
}
