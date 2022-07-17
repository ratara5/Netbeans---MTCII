/* */
package multiplicacion;
import javax.swing.JOptionPane;

/* Esta clase se encarga de la lógica: retornar variable de resultado y tiene un método para imprimirla*/
public class Multiplicacion {
    private float f1, f2, producto;
    
    public Multiplicacion(float factorUno, float factorDos){
        this.f1=factorUno;
        this.f2=factorDos;
    }
    
    public void operacion(){
        producto=f1*f2;
    }
    
    public void imprimir(){
    operacion();
    JOptionPane.showMessageDialog(null,f1+"x"+f2+"="+producto); // yo imprimiría en la clase Main (acaso no es la de interacción con el usuario?
    }
}
