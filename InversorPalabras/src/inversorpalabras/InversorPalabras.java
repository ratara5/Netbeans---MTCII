/* 
 * Creado por mí
 * Versión 1.0
 * Creado el 27/06/2021
*/
package inversorpalabras;

import java.util.Scanner;

public class InversorPalabras {

    
    public static void main(String[] args) {
        String fraseIngresada="", fraseInvertida="";
        int longitud=0;
        Scanner intro=new Scanner(System.in);
        
        System.out.println("Por favor, ingrese la frase");
        fraseIngresada=intro.nextLine();
    
    //Aquí cuento los caracteres
    longitud=fraseIngresada.length(); //Aquí cuento los caracteres 
    
        while(longitud!=0){
            fraseInvertida+=fraseIngresada.substring(longitud-1,longitud);
            //System.out.printl("addddssshhh");
            longitud-=1;
        }
        System.out.print("Frase invertida: "+fraseInvertida);
        System.out.println("");
        
    
    }
    
}
