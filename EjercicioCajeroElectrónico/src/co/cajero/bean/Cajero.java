
/* LA EXPLICACIÓN ESTÁ EN: https://www.youtube.com/watch?v=nUuVdKBttKc*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cajero.bean;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author TabSan
 */
public class Cajero {

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    private List<Cliente> clientes=new LinkedList<>(); //El cajero tiene una lista de clientes
    
    public Cliente login(String documento, String contrasena){ //Recibe un # documento y una contraseña. Devuelve boolean. Va a ser verdadero si el cliente que solicita ingresar está en la lista de clientes y su contraseña coincide con la de la misma lista
        Cliente clienteLogueado=null; //se sustituye por boolean sw=false;
        for(Cliente cliente: clientes){
            if(cliente.getNumeroDeCedula().equals(documento)){
                if(cliente.getConstrasena().equals(contrasena)){
                    clienteLogueado=cliente;
                }
                break; //Al encontrar el cliente no se requiere seguir buscando
            }
        }
        return clienteLogueado; //se sustitute por return sw
    }
    
    public boolean retirar(Cliente cliente, float retiro){
        boolean sw=false; // boolean que indica si podemos o no podemos retirar
        if(cliente.getSaldo()<=retiro){
            cliente.setSaldo(cliente.getSaldo()-retiro);// Se actualiza el saldo: lo que se tenía menos lo que se retiró
            sw=true;
        }
        return sw;
    }
    
    public float consultarSaldo(Cliente cliente){ //retorna el saldo de un cliente
        return cliente.getSaldo();
    }
    
    public float consignar(Cliente cliente, float consignacion){ //retorna el saldo del cliente después de haber consignado algo
        cliente.setSaldo(cliente.getSaldo()+consignacion);
        return cliente.getSaldo();
    }
    
}
