
package reto3;


public class Celulares extends Equipos{
    
    //Variables
        private final static Integer ALMACENAMIENTO_BASE=50;

        private Integer almacenamiento;

    //Constructor
     public Celulares(){
         this(PRECIO_BASE,PESO_BASE,MODELO_BASE,ALMACENAMIENTO_BASE);
     }

     public Celulares(Double precio, Integer peso){
        this(precio,peso,MODELO_BASE,ALMACENAMIENTO_BASE);
     }
     
     //Constructor
     public Celulares(Double precio, Integer peso, char modelos, Integer almacenamiento){
         super(precio,peso,modelos);
         this.almacenamiento=almacenamiento;
    }

     // Métodos
     public Double calcularPrecio(){
         Double adicion=super.calcularPrecio();
         if(almacenamiento>100){
             adicion+=50;   
        }
        return adicion;
     }
     
     public Integer getCarga() {
        return almacenamiento;
     }
}
