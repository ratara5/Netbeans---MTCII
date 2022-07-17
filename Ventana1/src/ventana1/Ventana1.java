/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana1;

import javax.swing.JOptionPane;


public class Ventana1 {


    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
 
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
         JOptionPane.showMessageDialog(null,"El número entero es: "+entero);
          JOptionPane.showMessageDialog(null,"La letra es: "+letra);
           JOptionPane.showMessageDialog(null,"El número decimal es: "+decimal);
        }
    
    
    
}
