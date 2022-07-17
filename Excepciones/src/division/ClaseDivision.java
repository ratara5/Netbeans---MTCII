package division;
import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {
        
        try{ //insertar entre llaves todo el código que deseamos ejecutar, pero que no sabemos si tenga errores
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el primer valor");
            valor1=entrada.nextInt();
            System.out.println("Ingrese el segundo valor");
            valor2=entrada.nextInt();

            resultado=valor1/valor2;
            System.out.println("Cociente es: "+resultado);
        }catch(Exception er){ //poner el comportamiento del programa en caso de error
            System.out.println("Error! "+er);
            
        }finally{//Esto se va a ejecutar sin importar que lo ocurriera fuera try o catch
            System.out.println("Operación concluida");
        }
        
    }
    
}
