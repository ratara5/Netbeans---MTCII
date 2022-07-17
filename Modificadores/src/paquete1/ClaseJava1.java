/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package paquete1;
//No hay q escribir import para llamar atributos o métodos de clases que estén dentro del mismo paquete;

/**
 *
 * @author TabSan
 */
public class ClaseJava1 {
    public static void main(String[] args) {
        AtributosMetodos mensajero=new AtributosMetodos();
        boolean sw=mensajero.valorDos==0; //Se puede acceder a los argumentos de otra clase en el miso pquete, ya que el modificador es el modificador por defecto.
        
        AtributosMetodos mensajero1=new AtributosMetodos();
        boolean sw1=mensajero1.valor1==0; //Se puede acceder a los argumentos de otra clase en el miso pquete, el modificador es el modificador público.
        
        AtributosMetodos mensajero2=new AtributosMetodos();
        boolean sw2=mensajero2.v1==0; //No se puede acceder a los argumentos de otra clase en el mismo paquete, ya que el modificador de acceso es el modificador private.
        
        mensajero.getV3(); // puedo obtener el valor del parámetro v3 de otra clase aunque sea private ya que le aplique un getter, igual si deseo un set.
        
        
        AtributosMetodos mensajero3=new AtributosMetodos();
        boolean sw3=mensajero3.vIII=="0"; //Se puede acceder al atributo vIII, ya que este está protected y dentro del mismo paquete.
        mensajero.metodoRaymond3(); // Se puede acceder al método Raymond3 ya que está protected y dentro del mismo paquete.
        
    }
    
}
