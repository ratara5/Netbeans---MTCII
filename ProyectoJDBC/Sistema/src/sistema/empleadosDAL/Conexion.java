/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.empleadosDAL;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    String strConexionDB = "jdbc:sqlite:C:/Users/TabSan/NetBeansProjects/ProyectoJDBC/SISTEMA.db";
    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            JOptionPane.showMessageDialog(null, "Conexión Establecida");
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + e);
            System.out.println("Error de conexión "+e);
        }
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
} 
