package cuadrilatero;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        Cuadrilatero cuadrado1=new Cuadrilatero(2);
        System.out.println(cuadrado1.getPerimetro());
        System.out.println(cuadrado1.getArea());
        
        Cuadrilatero rectangulo1=new Cuadrilatero(2,3);
        System.out.println(rectangulo1.getPerimetro());
        System.out.println(rectangulo1.getArea());
        
        float l1, l2;
        
        l1=Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor, ingrese el lado 1"));
        l2=Float.parseFloat(JOptionPane.showInputDialog(null,"Por favor, ingrese el lado 1"));
        
        Cuadrilatero rectangulo2=new Cuadrilatero(l1,l2);
        
        JOptionPane.showMessageDialog(null, "El Perímetro del rectángulo de lados "+l1+" y "+l2+" es: "+rectangulo2.getPerimetro());
        JOptionPane.showMessageDialog(null, "El Perímetro del rectángulo de lados "+l1+" y "+l2+" es: "+rectangulo2.getArea());
  
    }
}
