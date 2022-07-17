package cuadrilatero;

public class Cuadrilatero {

    private float l1, l2;

    public Cuadrilatero(float l1, float l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public Cuadrilatero(float l1) {
        this.l1 = this.l2 = l1;
    }
    
    public float getPerimetro(){
        float perimetro=2*(l1+l2);
        return perimetro;
    }
    
    public float getArea(){
        float perimetro=l1*l2;
        return perimetro;
    }

}
