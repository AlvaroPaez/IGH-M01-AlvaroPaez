package BancoRed.prueba;

import BancoRed.dto.ClientesDto;
import BancoRed.services.ClienteService;

public class Prueba02 {

    public static void main(String[] args) {
        try {
            ClienteService service = new ClienteService();
            
            // Antes de modificar 
            service.mostrarDatos(10);
            System.out.println("\n");
            
            // Modificacion
            ClientesDto cli = new ClientesDto(10, "Juan Pérez", "Calle Principal 123", "548545");
            service.actualizarDatos(cli);
            System.out.println("\n");

            // Despues de modificar
            service.mostrarDatos(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
