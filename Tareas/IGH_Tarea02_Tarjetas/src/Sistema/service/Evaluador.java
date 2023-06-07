package Sistema.service;

public class Evaluador {
    
    public boolean calificarCliente(int nivelCrediticio, boolean estaLaborando, double ingresosMensuales, boolean tieneAtrasos) {
        // Necesario para las pruebas en consola
        if (nivelCrediticio < 0 || nivelCrediticio > 775) return false;

        if (nivelCrediticio < 499) return false;

        if (!estaLaborando) return false;

        if (ingresosMensuales <= 3000.00) return false;

        if (tieneAtrasos) return false;
        
        return true;
    }
}
