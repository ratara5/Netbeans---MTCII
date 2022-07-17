package clases;

// Hay dos maneras de usar hilos threads...
public class Proceso1 extends Thread{ //...1.Ser heredero de la clase Thread
    //... y polimorfismo
    @Override
    public void run(){
         for (int i = 0; i <= 5; i++) { //Este ya es un hilo.
            System.out.println("Proceso 1"); 
        }
    }
}
