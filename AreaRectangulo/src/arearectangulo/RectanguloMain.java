
package arearectangulo;

import javax.swing.JOptionPane;


public class RectanguloMain {
    public static void main(String args[]){
        
        float base=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de la base"));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
        
        Rectangulo area=new Rectangulo(base,altura);
        
        area.mostrar();
    }
}
