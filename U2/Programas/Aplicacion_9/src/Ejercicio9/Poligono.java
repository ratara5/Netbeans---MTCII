
package Ejercicio9;

public abstract class Poligono {                                                                                  
  
    private int numLados;

    public Poligono() {
    }

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public String toString() {
        return "Numero Lados=" + numLados;
    }
    
    //Declaración del método abstracto area()                                                                     
    public abstract double area();
}