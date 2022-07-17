/*
Esta clase se usa para la parte lógica
 */
package suma;

public class Suma {
    private int vUno, vDos, resultado;
    
    public Suma(int valUno, int valDos){ //Constructor. Lo que hay dentro de paréntesis son variables pa' guardar lo que llega desde la instanciación
        this.vUno=valUno; //se le puede quitar el this. Solo es útil si las variables se llamaran igual que al instanciar desde Main.
        this.vDos=valDos;
    }
    public void operacion(){ //Nos permite ver el retorno
        resultado=vUno+vDos;
    }
    public void imprimir(){
        operacion();
        System.out.println("El resultado de la suma es: "+resultado);
    }
}
