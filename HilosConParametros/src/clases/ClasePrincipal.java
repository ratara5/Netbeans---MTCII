package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        Proceso hilo1 = new Proceso(5, "Hilo1"); //java inicia a contar desde el hilo 0, luego 1,2,3... (1er ESTADO: CREACIÓN DEL HILO)
        Proceso hilo2 = new Proceso(10, "Hilo2");
        Proceso hilo3 = new Proceso(5, "Hilo3");

        //Si no se usa el método contructor de la clase Proceso y la instanciación de las lineas 5 y 6, se puede usar el método modificarValor definido en la misma clase Proceso
        /* 
        hilo1.modificarValor(5);
        hilo2.modificarValor(10);
         */
        hilo1.start(); //(2DO ESTADO: EJECUCIÓN DEL HILO. Causado con start())          

        try {
            hilo1.sleep(10000);//hilo1 dormir (tantos ms) //(3ER ESTADO: BLOQUEO) Solo se va a ejecutar el primer 'for' del Hilo1 (Sí es solo el primer for? OJO uq e sleep parece un retardo al reposo si dentro del hilo hay instrucciones también con sleep
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo1 " + e);
        }
        hilo2.start();

        try {
            hilo2.sleep(3000);//hilo1 dormir 1000ms //(3ER ESTADO: BLOQUEO) Solo se va a ejecutar el primer 'for' del Hilo1 (Sí es solo el primer for?)
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo2 " + e);

            hilo3.start(); 
            hilo3.stop(); //(4TO ESTADO: MUERTE) Causada con stop(), Natural al terminar la ejecución
        }
    }
