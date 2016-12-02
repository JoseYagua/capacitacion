package capacitacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conectar=null;
    public Conexion() {
        try {           
            String USER="root";
            String URL="jdbc:mysql://localhost/polar";
            String CONTRA="ja4512yv08.";
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(URL, USER,CONTRA);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de Conexion","Error",JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            System.out.print(ex);
        }
    }
}