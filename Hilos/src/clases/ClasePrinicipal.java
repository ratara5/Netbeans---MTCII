
package clases;

//Hilos nos permiten ejecutar procesos de manera simultanea.
public class ClasePrinicipal {
    
    public static void main(String[] args) {
        
        System.out.println("SIN uso de hilos");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1"); 
        }
        
        System.out.println("");
        
        for (int i=0; i<=5; i++){ //Este proceso se ejecuta apenas acabe el Proceso 1.
            System.out.println("Proceso 2");
        }
        
        System.out.println("-------------------------");
        System.out.println("CON uso de hilos");
        Proceso1 hilo1=new Proceso1();
        Thread hilo2=new Thread(new Proceso2());//Esto por haber usado el implements Runnable. Si se usara el extends Thread sería como la linea anterior.
        Proceso1 hilo3=new Proceso1(); //No es necesario crear una clase para cada hilo
        
        hilo1.start();// arrancar los hilos. Estrictasmente en ese orden, crear todos los hilos y luego arrancarlos
        hilo2.start();
        hilo3.start();
    }  
}
