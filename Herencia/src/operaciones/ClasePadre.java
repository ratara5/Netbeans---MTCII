package operaciones;
import java.util.Scanner;

// Esta clase le va a DAR herencia a otras
// Esta clase NO TIENE método main
public class ClasePadre {
    protected int valor1=0, valor2=0, resultado=0;
    Scanner entrada=new Scanner(System.in);
    
    // Este método pide los  valores al usuario
    public void pedirDatos(){ //métodos por lo general deben ser públicos para poder instanciarlos y llamarlos desde otras clases.
        System.out.print("Dame el primer valor: ");
        valor1=entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2=entrada.nextInt();
        
    }
    
    //Este método muestra el resultado
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}

