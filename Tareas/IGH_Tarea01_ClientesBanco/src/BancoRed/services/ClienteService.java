package BancoRed.services;

import BancoRed.dto.ClientesDto;
import bancored.db.AccesoDB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteService {

    private Connection cn;
    private final String CLIENTE_UPDATE = "UPDATE Clientes SET cli_nombre=?, cli_direccion=?, cli_telefono=? WHERE cli_id=?";
    private final String CLIENTE_SELECT = "SELECT * FROM Clientes WHERE cli_id=?";

    public void actualizarDatos(ClientesDto cli) {
        PreparedStatement pstm;
        ResultSet rs;

        try {
            // Verificar si los campos nombre y dirección no están vacíos
            if (cli.getNombre().isEmpty() || cli.getDireccion().isEmpty()) {
                throw new SQLException("Los campos nombre y dirección no pueden estar vacíos.");
            }

            cn = AccesoDB.getConnection();

            // Verificar si el cliente existe, solo para las pruebas de consola
            String existentes = "SELECT COUNT(*) FROM Clientes WHERE cli_id=?";
            pstm = cn.prepareStatement(existentes);
            pstm.setInt(1, cli.getId());
            rs = pstm.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            if (count == 0) {
                throw new SQLException("El cliente con ID " + cli.getId() + " no existe en la base de datos.");
            }

            pstm = cn.prepareStatement(CLIENTE_UPDATE);
            pstm.setString(1, cli.getNombre());
            pstm.setString(2, cli.getDireccion());
            // Verificar si el valor telefono está vacío y reemplazarlo con NULL si es así
            if (cli.getTelefono().isEmpty()) {
                pstm.setNull(3, java.sql.Types.VARCHAR);
            } else {
                pstm.setString(3, cli.getTelefono());
            }
            pstm.setInt(4, cli.getId());

            pstm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    //Solo para la prueba
    public void mostrarDatos(int id) {
        PreparedStatement pstm;
        ResultSet rs;

        try {
            cn = AccesoDB.getConnection();
            pstm = cn.prepareStatement(CLIENTE_SELECT);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                int clientId = rs.getInt("cli_id");
                String nombre = rs.getString("cli_nombre");
                String direccion = rs.getString("cli_direccion");
                String telefono = rs.getString("cli_telefono");

                System.out.println("ID: " + clientId + ", Nombre: " + nombre);
                System.out.println("Direccion: " + direccion + ", Telefono: " + telefono);
            } else {
                throw new SQLException("El cliente con ID " + id + " no existe en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Object[]> obtenerDatosClientes() {
        List<Object[]> datosClientes = new ArrayList<>();
        try {
            // Obtener la conexión desde AccesoDB
            Connection cn = AccesoDB.getConnection();
            // Crear la declaración
            Statement stm = cn.createStatement();
            // Ejecutar la consulta
            ResultSet rs = stm.executeQuery("SELECT * FROM Clientes");

            // Iterar sobre los resultados y agregarlos a la lista
            while (rs.next()) {
                int id = rs.getInt("cli_id");
                String nombre = rs.getString("cli_nombre");
                String direccion = rs.getString("cli_direccion");
                String telefono = rs.getString("cli_telefono");

                // Verificar si el valor es NULL y reemplazarlo por una cadena vacía
                if (rs.wasNull()) {
                    telefono = "";
                }

                Object[] fila = {id, nombre, direccion, telefono};
                datosClientes.add(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosClientes;
    }

}
