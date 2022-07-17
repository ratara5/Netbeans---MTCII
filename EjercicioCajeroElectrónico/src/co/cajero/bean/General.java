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
//static es para tener variables globales (por así decirlo)
//nos interesa tener la variable global de General para poder
//acceder desde cualquier parte del programa:
//tanto esta clase como las clases Cajero y Cliente deben implementar la clase Serializable
//del autor "Belisario"

public class General { //Para crear el cajero y los clientes.
    
    private static Cajero cajero=null;
    public static List<Cliente> clientes=null;
    
    static{ //Cuando el aplicativo se cargue se crean los clientes en una lista de clientes
      crearClientes(); 
      crearCajero();
        
    }
    
    //Si deseamos persistencia... Cuando se cargue el programa, invocamos método pa cargar info
    /*static cargarInformacion(){
        General generalTmp=SerializarObjeto.deserializarObjeto("Cajero.Mauro", General.class);
        generalTmp=new General();
        generalTmp.clientes=crearClientes();
        generalTmp.cajero=crearCajero();
        crearClientes();
        crearCajero();
        if(generalTmp==null){
        }else{
            General.general=generalTmp
        }
    }
    */
    static void crearClientes(){
        //List<Clientes> clientes=new LinkedList<>() <- Esto es pa persistencia
        clientes=new LinkedList<>();
        System.out.println("Inicia el proceso para creación lista clientes");
        
        Cliente cliente=new Cliente();
        cliente.setNombreCompleto("Mauricio");
        cliente.setNumeroDeCedula("1045");
        cliente.setConstrasena("xxxx1");
        cliente.setSaldo(10000f);
        clientes.add(cliente);
        
        cliente=new Cliente();
        cliente.setNombreCompleto("Belisario");
        cliente.setNumeroDeCedula("32");
        cliente.setConstrasena("xxxx2");
        cliente.setSaldo(5000f);
        clientes.add(cliente);
        
        cliente=new Cliente();
        cliente.setNombreCompleto("Karen");
        cliente.setNumeroDeCedula("99");
        cliente.setConstrasena("xxxx3");
        cliente.setSaldo(20000f);
        clientes.add(cliente);
        System.out.println("Se terminó el proceso de la creación de los clientes");
        //return clientes; <- Para persistencia

    }
    private static void crearCajero(){ //Cambiar a private static Cajero... <- Para persistencia
        cajero=new Cajero();
        getCajero().setClientes(clientes);
        //return cajero; <- Para persistencia
        
}

    /**
     * @return the cajero
     */
    public static Cajero getCajero() {
        return cajero;
    }
     /*public void guardar(){ //<-Para persistencia
        SerializarObjeto.serializarobjeto("nombre archivo",this);
    }
    */
    
}
