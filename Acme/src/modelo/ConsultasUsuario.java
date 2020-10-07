package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasUsuario extends Conexion {

    public boolean registar(Usuario user) {
        PreparedStatement ps = null;
        Connection con = getConection();

        String sql = "INSERT INTO `Usuario`(`Num_Documento `, `Tipo_Documento`, `Nombre`, `Apellido`, `Telefono`, `Direccion`, `Titulos`, `Estado`, `Nombre_Usuario`, `Contraseña`, `Correo`, `Fecha_Nacimiento`, `Lugar_Graduacion`, `Atenciones `, `Trabajos `) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getNum_Documento());
            ps.setString(2, user.getTipo_Documento());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setString(5, user.getTelefono());
            ps.setString(6, user.getDireccion());
            ps.setString(7, user.getTitulos());
            ps.setString(8, user.getEstado());
            ps.setString(9, user.getNombre_Usuario());
            ps.setString(10, user.getContraseña());
            ps.setString(11, user.getCorreo());
            ps.setString(12, user.getFecha_Nacimiento());
            ps.setString(13, user.getLugar_Graduacion());
            ps.setInt(14, user.getAtenciones());
            ps.setInt(15, user.getTrabajos());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
