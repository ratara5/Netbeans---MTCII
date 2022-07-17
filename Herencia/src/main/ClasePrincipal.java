package main;
import operaciones.ClaseHijaSuma;
import operaciones.ClaseHijaResta;
//No necesitamos llamar a la clase Padre, pues clase Suma y clase Resta ya RECIBIERON herencia de ella.

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHijaSuma suma=new ClaseHijaSuma();
        System.out.println("Suma de dos números");
        suma.pedirDatos();
        suma.sumar();
        System.out.println("El resultado de la suma es: ");
        suma.mostrarResultado();
        
        System.out.println("********************************");
        
        ClaseHijaResta resta=new ClaseHijaResta();
        System.out.println("Resta de dos números");
        resta.pedirDatos();
        resta.restar();
        System.out.println("El resultado de la resta es: ");
        resta.mostrarResultado();
    }
}
