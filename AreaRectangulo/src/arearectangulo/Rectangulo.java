
package arearectangulo;
import javax.swing.JOptionPane;
         
public class Rectangulo {
    private float b,h,a;
    
    public Rectangulo(float b, float h){
        this.b=b;
        this.h=h;       
    }
    public void operacion(){
        a=b*h;
    }
    public void mostrar(){
        operacion();
        JOptionPane.showMessageDialog(null, "El Área del rectángulo de base "+b+"u y altura "+h+"u es "+a+"u^2");
    }
    
}
