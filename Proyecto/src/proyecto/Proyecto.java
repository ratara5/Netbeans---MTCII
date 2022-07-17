/*
 * Reto 1 MinTic 2022 Ciclio II 21/07/2021
*/

package proyecto;


public class Proyecto {

    double pCapital, pInteres, cI;
    int pTiempo;

    public double calcularInteresSimple(){
    	return Math.round(pCapital*pInteres*pTiempo);
    }
     
     public double calcularInteresCompuesto(){
     	return Math.round(pCapital*(Math.pow((1+pInteres),pTiempo)-1));
    }

    public double cotejarInversion (int pTiempo, double pCapital, double pInteres ){
	this.pTiempo=pTiempo;
	this.pCapital=pCapital;
	this.pInteres=pInteres;
        return Math.round(calcularInteresCompuesto()-calcularInteresSimple());
    } 
    
    /*public static void main(String[] args) {
        cI=cotejarInversion(5,1650000,8);
        System.out.println(cI); 
    } /*<-- Debe estar en una clase Main????*/
}
