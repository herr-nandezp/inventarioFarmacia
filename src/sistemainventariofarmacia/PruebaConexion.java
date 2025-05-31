/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventariofarmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author a12
 */
public class PruebaConexion {
    public static void main(String[] args) {
        try {
            // 1. Cargar el driver
            Class.forName("org.mariadb.jdbc.Driver");

            // 2. Establecer conexión
            Connection conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/farmacia", "usuariojava", "miclave123"
            );

            // 3. Crear statement y ejecutar consulta
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos");

            // 4. Imprimir los resultados
            while (rs.next()) {
                System.out.println(
                    rs.getString("codigo_barras") + " | " +
                    rs.getString("nombre") + " | " +
                    rs.getDouble("precio_unitario") + " | " +
                    rs.getInt("cantidad_stock")
                );
            }

            // 5. Cerrar conexión
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}
