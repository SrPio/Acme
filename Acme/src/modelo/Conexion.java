
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
     public static final String URL = "jdbc:mysql://db4free.net:3306/desarrollo2"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "desarrollo2"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "desarrollo2"; //Password del usuario
    
     public static Connection getConection() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion a base de datos exitosa!");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
}
