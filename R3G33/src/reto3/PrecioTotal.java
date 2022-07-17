
package reto3;

public class PrecioTotal {
    // Variable
    private Double totalEquipos=0.0;
    private Double totalCelulares=0.0;
    private Double totalTablets=0.0;
    private Equipos[] listaEquipos;
    
    //Constructor

    public PrecioTotal(Equipos[] pEquipos) {
        this.listaEquipos=pEquipos;
    }
    
    // Código
    public void mostrarTotales(){
        for (int i = 0; i < listaEquipos.length; i++){
            if(listaEquipos[i] instanceof Equipos){
                totalEquipos+=listaEquipos[i].calcularPrecio();    
            }
            if(listaEquipos[i] instanceof Celulares){
                totalCelulares+=listaEquipos[i].calcularPrecio();    
            }
            if(listaEquipos[i] instanceof Tablet){
                totalTablets+=listaEquipos[i].calcularPrecio();    
            }   
        }
        // Mostramos los resultados
        System.out.println("La suma del precio de los equipos es de " + totalEquipos);
        System.out.println("La suma del precio de los equipos celulares es de " + totalCelulares);
        System.out.println("La suma del precio de los equipos tablet es de " + totalTablets);
    } 
}

