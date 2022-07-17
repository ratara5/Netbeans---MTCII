package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija hija=new ClaseHija(); 
        hija.saludar(); //Se va a ejecutar el método saludar() de la clase hija
        hija.saludarOriginal(); //Se va a ejecutar el método saludar() de la clase padre
    }
    
}
