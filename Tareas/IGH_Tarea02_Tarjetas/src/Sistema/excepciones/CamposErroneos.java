package Sistema.excepciones;

public class CamposErroneos extends Exception {
    
    public CamposErroneos() {
        super("Debe ingresar la informacion correspondiente.");
    }
    
    public CamposErroneos(String mensage) {
        super(mensage);
    }
}
