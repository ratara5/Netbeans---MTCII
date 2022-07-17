package operaciones;

public class ClaseHijaResta extends ClasePadre{
    public void restar(){
        resultado=valor1-valor2; //heredó los atributos (y métodos aunque acá no se usen) de la clase padre
    }  
}
