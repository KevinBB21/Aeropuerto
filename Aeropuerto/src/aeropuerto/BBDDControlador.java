/*
 * Proyecto Aeropuerto - Archivo BBDDControlador.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package aeropuerto;

import java.sql.*;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 8 abr. 2022 16:04:02
 */
public class BBDDControlador {

    // DATOS DE CONEXION
    String url = "jdbc:mysql://localhost:3306/aeropuerto";
    String username = "admin";
    String password = "ausias";

    // VARIABLES DE CONEXIÓN
    private static Connection connection;
    private static Statement statement;
    private static boolean succeed;
    private static ResultSet rs;

    public void conectar() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);

    }

    public static void createVuelo(Aeropuerto x) throws SQLException {
        statement = connection.createStatement();

        succeed = statement.execute("INSERT into vuelo (nvuelo, companyia, destino, hora, num_pas, max_pas) VALUES (" + "'" + x.getNvuelo() + "'" + "," + "'" + x.getCompanyia() + "'" + "," + "'" + x.getDestino() + "'" + "," + "'" + x.getHora() + "'" + "," + "'" + x.getNum_pas() + "'" + "," + "'" + x.getMax_pas() + "'" + ");");

        statement.close();
    }

    public static void selectVuelo(Aeropuerto x) throws SQLException {
        Statement statement = connection.createStatement();
        rs = statement.executeQuery("SELECT * FROM persona");

        while (rs.next()) {

            int id = rs.getInt("id");
            int nvuelo = rs.getInt("nvuelo");
            String companyia = rs.getString("companyia");
            String destino = rs.getString("destino");
            Time fecha = rs.getTime("hora");
            int num_pas = rs.getInt("num_pas");
            int max_pas = rs.getInt("max_pas");

            
            System.out.println(String.format("%d, %d, %s, %s, %s,%d, %d", id, nvuelo, companyia, destino, fecha, num_pas , max_pas));
        }
    }
}
