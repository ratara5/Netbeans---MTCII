/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paquete2;

import paquete1.AtributosMetodos; //La clase DEBE IMPORTARSE pues está en OTRO PAQUETE.

/**
 *
 * @author TabSan
 */
public class ClaseJava2 {
    public static void main(String[] args) {
        AtributosMetodos mensajero=new AtributosMetodos(); // cada clase tiene sus propios métodos, por eso no es necesario cambiar el nombre 'mensajero'.
        boolean sw=mensajero.valorDos==0; //No se puede acceder al atributo (variable?) de la clase 1, pues está en otro paquete y el modificador de acceso es el modificador de acceso por defecto.
        
        AtributosMetodos mensajero1=new AtributosMetodos();
       boolean sw1=mensajero1.valor1==0; //Se puede acceder a los argumentos de otra clase en otro pquete, ya que el modificador es el modificador público.
       
       AtributosMetodos mensajero2=new AtributosMetodos();
        boolean sw2=mensajero2.v1; //No se puede acceder a los argumentos de otra clase en otro paquete, ya que el modificador de acceso es el modificador private (ni siquiera se puede acceder desde otras clases en el mismo paquete).
        
        mensajero2.metodoRaymond(); //...A este se puede por q es publico
        
        mensajero2.setV3("algo"); //...Puedo modificar el valor del parámetro de otra clase aunque sea private y de otro paquete, ya que aplique un setter.
        System.out.println(mensajero2.getV3()); //Puedo obtener el valor del parámetro de otra clase aunque sea private y de otro paquete, ya que aplique un getter.
        
        AtributosMetodos mensajero3=new AtributosMetodos();
        boolean sw3=mensajero3.vIII=="0"; //NO se puede acceder al atributo vIII, ya que este está protected y dentro otro paquete.
        mensajero.metodoRaymond3(); // NO se puede acceder al método Raymond3 ya que está protected y dentro de otro paquete.
    
    }
    
}
