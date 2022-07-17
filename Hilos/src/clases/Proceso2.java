
package clases;

// Hay dos maneras de usar hilos threads...
public class Proceso2 implements Runnable{ //...2.Implementar la interfaz Runnable
    
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) { //Este ya es un hilo.
            System.out.println("Proceso 2"); 
        }
        
    }
    
}
