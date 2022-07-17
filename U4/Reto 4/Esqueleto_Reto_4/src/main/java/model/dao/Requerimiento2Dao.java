package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento2;

public class Requerimiento2Dao {

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento2> rankingBancosAreaPromedioDescendente() throws SQLException {

        ArrayList<Requerimiento2> respuesta = new ArrayList<Requerimiento2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "SELECT p.Banco_Vinculado, AVG(tp.Area_Max) AS Area_Promedio  \n"
                    + "FROM Proyecto p  \n"
                    + "JOIN tipo tp \n"
                    + "ON p.ID_Tipo = tp.ID_Tipo    \n"
                    + "GROUP BY p.Banco_Vinculado   \n"
                    + "ORDER BY Area_Promedio   ";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            while (resultSet.next()) {
                Requerimiento2 bancoRankeadoAreaPromedio = new Requerimiento2();
                bancoRankeadoAreaPromedio.setBancoVinculado(resultSet.getString("Banco_Vinculado"));
                bancoRankeadoAreaPromedio.setAreaPromedio(resultSet.getDouble("Area_Promedio"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(bancoRankeadoAreaPromedio);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando ranking de bancos según el área promedio de proyectos respaldados: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;

    }

}
