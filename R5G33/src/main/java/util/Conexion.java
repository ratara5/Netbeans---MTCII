//Paquete para alojar las clases
package util;

//Librerías a importar con las clases necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase 'Conexion'
public class Conexion {

    //Declaración, tipo e inicialización de variables
    private static final String UBICACION_BD = "ProyectosConstruccion.db"; // Variable 'UBICACION_BD' del tipo String

    String url = "jdbc:sqlite:" + UBICACION_BD; // Variable 'url' del tipo String

    Connection conn = null; //Objeto 'conn' del tipo Connection

    //Constructor de la clase 'Conexion'
    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC"); //Cargar el driver encargado de la función 'conectarse'
            conn = DriverManager.getConnection(url); //'conn' es un objeto que resulta de aplicar el método 'getConnection(con parámetro url)' a la clase 'DriverManager'
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet consultarRegistros(String url) {
        try {

            PreparedStatement pstm = conn.prepareStatement(url); //Objeto 'pstm' como instancia de la clase 'PreparedStatement'
            ResultSet respuesta = pstm.executeQuery(); //Objeto 'respuesta' del tipo 'Resulset' que resulta de aplicar el método 'executeQuery()' al objeto 'pstm'
            return respuesta;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
