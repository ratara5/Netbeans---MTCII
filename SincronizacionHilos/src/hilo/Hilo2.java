package hilo;

public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            try{
                this.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error en el for de hilo 2 "+e);
            }
        }
        
    }
}

