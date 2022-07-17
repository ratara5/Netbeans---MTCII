package hilo;

public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("G");
            try{
                this.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en el for de hilo 1 "+e);
            }
        }
    }
}
