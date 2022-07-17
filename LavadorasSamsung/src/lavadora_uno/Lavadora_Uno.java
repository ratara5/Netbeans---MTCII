/*
 * Simulando que soy el programador de samsung y voy a instanciar LlFunciones.class
 * Programador de samsung solo le va a pedir datos al usuario, todo lo demás lo hace LlFunciones.class (que la hizo otro programador contratado)
 * Se crea un nuevo paquete (en este caso se llamó biblioteca) dentro de este proyecto y se copia la clase LlFunciones en dicho paquete. Dicha clase fue suministrada en un disp de almacenamiento o por correo. 
 */
package lavadora_uno;

import biblioteca.LlFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main(String args[]){ //Con este método ponemos a operar la lavadora
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca(1) o de color(2)?");
        int tipoDeRopa=entrada.nextInt();
        
        System.out.println("Cuántos kilos de ropa?");
        int kilos=entrada.nextInt();
        
        LlFunciones mensajero=new LlFunciones(kilos,tipoDeRopa); // antes de que la variable tipoDeRopa sea enviada. Ya hay...
        mensajero.setTipoDeRopa(2); //... por default un 2. Jamás se volverá a cumplir la condición tipoDeRopa=1 o ==1
        System.out.println("El tipo de ropa es: "+mensajero.getTipoDeRopa());
        mensajero.cicloFinalizado(); //Solo aparece como sugerencia de NetBeans cicloFinalizado que es el que samsung nos dijo que fuera público      
        
        
    }       
}
