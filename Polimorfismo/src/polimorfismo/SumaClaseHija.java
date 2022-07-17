
package polimorfismo;
// no hay que importar nada pues estamos en el mismo paquete

public class SumaClaseHija extends OperacionesClasePadre{
    //Sobreescribir el método operacion(), sin el abstract
    @Override 
    public void operaciones(){
        resultado=valor1+valor2;
    } 
}
