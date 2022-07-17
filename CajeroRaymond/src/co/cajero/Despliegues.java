
package co.cajero;

import java.util.Scanner;

public class Despliegues {
    int opcion;
    public int menuRay(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor selecciona la opción deseada:\n1. Consultar saldo\n2. Retirar\n3. Depositar \n4. Salir");
        opcion=entrada.nextInt();
        return opcion;
        
    }
   
    
    
}
