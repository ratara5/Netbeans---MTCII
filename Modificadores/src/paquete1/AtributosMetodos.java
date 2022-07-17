/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete1;

/**
 *
 * @author TabSan
 */
public class AtributosMetodos {
    
    int valorUno; //si no hay modificador de acceso, se establece el modificador de acceso por defecto, no están antecedidos de public o private. Solo se puede acceder a estos atributos (tipos?) desde una clase que esté en el mismo paquete (en este caso solo la Clase Java1)
    int valorDos;
    private String valorTres;
    
    public int valor1; //Al poner public, se puede acceder a atributos y métodos desde cualquier clase sin importar si está o no dentro del mismo paquete
    public int valor2;
    public String valor3;
    
    private int v1; //Al poner private, se restringe el uso del atributo a solo la clase en la que se declara. La única manera de acceder sería a través de getter y setter.
    private int v2;
    private String v3;
    
    protected int vI; //Al poner protected, los elementos solo pueden ser accedidos desde su mismo paquete (al igual que el modificar por defecto). También pueden ser accedidos desde cualquier clase que herede la clase en la que se encuentra, sin importar si estan en el mismo paquete o no.
    protected int vII;
    protected String vIII;
        
    public void metodoRaymond(){
        
    }

    /**
     * @return the v3
     */
    public String getV3() { //se aplica getter a un argumento privado
        return v3;
    }

    /**
     * @param v3 the v3 to set
     */
    public void setV3(String v3) { //se aplica setter a un argumento privado
        this.v3 = v3; //se modifica la variable v3 de esta(this) clase, asignándole el valor de parámetro (entrada) v3.
        
        
    }

    protected void metodoRaymond3(){
        
    }
    
    
}
