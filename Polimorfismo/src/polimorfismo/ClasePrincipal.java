package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        OperacionesClasePadre suma=new SumaClaseHija(); //ojo hay un cambio por el polimorfismo. Ya no es SumaClaseHija suma=new SumaClaseHija(). SumaClaseHija se llama 'objeto con el que me estoy comunicando'.
        suma.pedirDatos();
        suma.operaciones();//no importa si le digo si está sumando o restando, ya sabe, pues el objeto con el que me estoy comunicando es SumaClaseHija().
        System.out.println("El resultado de la suma es:");
        suma.mostrarResultado();
        
        System.out.println("**********************");
         OperacionesClasePadre resta=new RestaClaseHija(); //ojo hay un cambio por el polimorfismo. Ya no es RestaClaseHija suma=new RestaClaseHija(). RestaClaseHija se llama 'objeto con el que me estoy comunicando'. Ojo que el objeto podría seguir llamándose suma o como se quiera.
        resta.pedirDatos();
        resta.operaciones();//no importa si le digo si está sumando o restando, ya sabe, pues el objeto con el que me estoy comunicando es SumaClaseHija().
        System.out.println("El resultado de la resta es:");
        resta.mostrarResultado();
    }
}
