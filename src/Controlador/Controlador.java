package Controlador;

import Modelo.Area;
import Modelo.Circunferencia;
import Modelo.Diametro;
import Modelo.LecturaRadio_int;
import Modelo.Modelo;
import Modelo.Numero_int;
import Vista.Vista;

public class Controlador {
    Modelo modelo;
    Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar(){
        LecturaRadio_int leerRadio = new LecturaRadio_int(); //Se instancia el objeto "leerRadio" tipo LecturaRadio_int
        Diametro calcularDiametro = new Diametro(); //Se instancia el objeto "calcularDiametro" tipo Diametro
        Circunferencia calcularCircunferencia = new Circunferencia(); //Se instancia el objeto "calcularCircunferencia" tipo Circunferencia
        Area calcularArea = new Area(); //Se instancia el objeto "calcularArea" tipo Area
        
        vista.mostrarPedirNumero();
        
        Numero_int radio; //Se crea la variable "radio" tipo Numero_int
        double diametro; //Se crea la variable "diametro" tipo flotante
        double circunferencia; //Se crea la variable "circunferencia" tipo flotante
        double area; //Se crea la variable "area" tipo flotante

        radio = leerRadio.leerRadio(); //Se captura el radio mediante el metodo leerRadio()
        diametro = calcularDiametro.calcularDiametro(radio); //Se calcula el Diametro mediante el metodo calcularDiametro()
        circunferencia = calcularCircunferencia.calcularCircunferencia(radio); //Se calcula la Circunferencia mediante el metodo calcularCircunferencia()
        area = calcularArea.calcularArea(radio); //Se calcula el Area mediante el metodo calcularArea()

        vista.mostrarOperaciones(diametro, circunferencia, area); //Llamamos a la clase "Vista" y le damos los parametros que pide
        
        vista.mostrarVersion();
    }
    

    
}
