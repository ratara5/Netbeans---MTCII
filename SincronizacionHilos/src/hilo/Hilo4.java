package hilo;

public class Hilo4 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("K");
            try{
                this.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en el for de hilo 4 "+e);
            }
        }
    }
}