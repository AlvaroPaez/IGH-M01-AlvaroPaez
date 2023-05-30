package bancored.prueba;

import java.sql.Connection;
import bancored.db.AccesoDB;

public class Prueba01 {

    public static void main(String[] args) {
        
        // Prueba de conexion
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok.");
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
