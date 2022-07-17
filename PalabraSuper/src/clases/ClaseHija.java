package clases;

public class ClaseHija extends ClasePadre{
    public void saludar(){
        System.out.println("Yo soy la hija");
    }
    public void saludarOriginal(){ //Este es el método heredado de la clase padre
        super.saludar(); // uso de la palabra reservada super, permite acceder al método de la clase padre, sin importar que dicho método tenga el mismo nombre de un método de la clase hija.
    }
    
}
