package operaciones;

//Esta clase va a RECIBIR herencia de otra clase(solo una: herencia simple, la única permitida en java.
public class ClaseHijaSuma extends ClasePadre{ //extends indica que se quiere RECIBIR herencia
    public void sumar(){
        resultado=valor1+valor2; //heredó los atributos (y métodos aunque acá no se usen) de la clase padre   
    }   
}
