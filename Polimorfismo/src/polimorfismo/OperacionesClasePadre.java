//En este ejercicio solo se trabaja un paquete
//Para usar polimorfismo es necesario usar herencia
/*Polimorfismo: método tiene comportamiento diferente
dependiendo de la clase con la que se está comunicando.*/
package polimorfismo;
import java.util.Scanner;

public abstract class OperacionesClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada=new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor1=entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2=entrada.nextInt();
    }
    
    //acá se crea el polimorfismo el método operacion se comporta diferente si se trata de suma(clase Suma) o resta (clase Resta).
    public abstract void operaciones();//la clase también debe ser abstracta y este método solo se puededeclarar dentro de la class, no se puede agregar la lógica (definir?); la lógica se agrega en cada clase hija (?)
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}
