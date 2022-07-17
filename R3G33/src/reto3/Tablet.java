package reto3;

public class Tablet extends Equipos{
     // Varible
    private final static Integer PULGADAS_BASE=50;
    
    private Integer pulgadas;
    private boolean GPS;
    
    //Constructor
    public Tablet(){
       this(PRECIO_BASE, PESO_BASE, MODELO_BASE, PULGADAS_BASE, false);
    }

    public Tablet(Double precioBase, Integer peso){
       this(precioBase, peso, MODELO_BASE, PULGADAS_BASE, false);
    }

    public Tablet(Double precioBase, Integer peso, char modelos, Integer pulgadas, boolean GPS){
       super(precioBase, peso, modelos);
       this.pulgadas=pulgadas;
       this.GPS=GPS;
    }

    // Métodos
    public Double calcularPrecio(){
        // Código
        double adicion=super.calcularPrecio();
        if(pulgadas>40){
            adicion+=precio*0.3;
        }
        if(GPS){
            adicion+=50;
        }

        return adicion;
    }
}

