/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mtciiclase3;

import javax.swing.JOptionPane;
/**
 *
 * @author TabSan
 */
public class MTCIIClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fecha=JOptionPane.showInputDialog("Ingresa la fecha de nacimiento formato dd/mm/aaaa");
        int sum=0;
        for(int i=0;i<fecha.length();i++){
            if(fecha.charAt(i)!='/'){
                sum+=Character.getNumericValue(fecha.charAt(i));
            }
        }
        JOptionPane.showMessageDialog(null, "suma es: "+ sum);
        
        //Saber si un número es M10
        String numtxt=JOptionPane.showInputDialog("Por favor ingresa el número");
        boolean sw=numtxt.charAt(numtxt.length()-1)=='0';
        JOptionPane.showMessageDialog(null,"¿El número "+numtxt+" es múltiplo de 10?: "+ sw);
    }
}

