package clases;

public class Proceso extends Thread {

    int num_int;
    String nombre_hilo;

    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + " - " + this.nombre_hilo);
            try {
                this.sleep(500); //Si deseo que cada ciclo se pause 1000 ms
            } catch (InterruptedException e) {
                System.out.println("Error en un ciclo del hilo " + this.nombre_hilo + e);
            }
        }
        System.out.println("");
    }

    public Proceso(int nI, String nomH) { //Constructor de la clase Proceso...Tmabién se puede poner iniciando
        this.num_int = nI;
        this.nombre_hilo = nomH;
    }

    //...Alternativamente, se puede crear el siguiente método...
    public void modificarValor(int valor) {
        this.num_int = valor;
    }
}
