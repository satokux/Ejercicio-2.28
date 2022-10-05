import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class App {
    public static void main(String[] args) {
        Vista vista;
        Modelo modelo;
        Controlador controlador;

        vista = new Vista();
        modelo = new Modelo();
        controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}
 