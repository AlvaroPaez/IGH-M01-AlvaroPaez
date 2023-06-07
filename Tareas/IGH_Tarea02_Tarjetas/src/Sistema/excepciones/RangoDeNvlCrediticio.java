package Sistema.excepciones;

public class RangoDeNvlCrediticio extends Exception {
    public RangoDeNvlCrediticio() {
        super("El nivel crediticio es incorrecto. Debe estar entre 0 y 775.");
    }
}
