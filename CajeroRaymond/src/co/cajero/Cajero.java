package co.cajero;

public class Cajero {
    private int saldo=500;
    
    public void consultaSaldo(){
        System.out.println("Tu saldo actual es: "+getSaldo());
        System.out.println("-------------------------------");
    }
    
    public void retiro(int retirar){
        System.out.println("Retiraste: "+retirar);
        setSaldo(getSaldo() - retirar);
        consultaSaldo();
        System.out.println("-------------------------------");
    }
    
    public void deposito(int depositar){
        System.out.println("Depositaste: "+depositar);
        setSaldo(getSaldo() + depositar);
        consultaSaldo();
        System.out.println("-------------------------------");
    }
    
    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
