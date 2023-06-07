package Sistema.prueba;

import Sistema.service.Evaluador;

public class Prueba01 {
    
    public static void main(String[] args) {
        Evaluador eval = new Evaluador();
        if(eval.calificarCliente(600, true, 4000.00, false)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        if(eval.calificarCliente(300, true, 4000.00, false)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        if(eval.calificarCliente(800, true, 4000.00, false)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        if(eval.calificarCliente(600, false, 4000.00, false)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
