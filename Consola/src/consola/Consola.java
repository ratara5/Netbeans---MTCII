/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.util.Scanner;

public class Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float num=0;
        
        System.out.println("Por favor, ingresa un número decimal");
        num=entrada.nextFloat();
        
        System.out.println("El número decimal ingresado es: "+num);
        
        /*String texto=""; 
                
        System.out.println("Por favor, ingresa una cadena");
        
        texto=String.valueOf(entrada.nextLine().charAt(2));
        
        System.out.println("El caracter en la posición 2 es "+texto);*/
                
    }
    
}
