/* */
package multiplicacion;
import javax.swing.JOptionPane;

/* En el Main... solo hay interacción con el usuario y llamadas a otra clase que se encarga de la lógica */
public class MultiplicacionMain {
    public static void main(String args[]){
    float factor1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer factor: "));
    float factor2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo factor: "));
    
    Multiplicacion resultado=new Multiplicacion(factor1,factor2);
    
    resultado.imprimir();
    }
}