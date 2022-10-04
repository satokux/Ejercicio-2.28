import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in); //Se instancia la clase "leer" tipo Scanner
        Numero radio = new Numero(); //Se instancia la clase "radio" tipo Numero
        Vista vista = new Vista(); //Se instancia la clase "vista" tipo Vista

        System.out.print("Digite el radio de un circulo: "); //Se pide el valor de "radio" por teclado
        int r = leer.nextInt(); //Se captura el valor dado por el usario en "r" 
        radio.setNumero(r); //Se asigna el valor de "r" a "radio"

        double diametro; //Se crea la variable "diametro" tipo flotante
        double circunferencia; //Se crea la variable "circunferencia" tipo flotante
        double area; //Se crea la variable "area" tipo flotante

        diametro = 2 * radio.getNumero(); //Se calcula el Diametro = (2r)
        circunferencia = 2 * Math.PI * radio.getNumero(); //Se calcula la Circunferencia = (2πr)
        area = Math.PI * Math.pow(radio.getNumero(), 2); //Se calcula el Area = (πr^2)

        vista.mostrarOperaciones(diametro, circunferencia, area); //Llamamos a la clase "Vista" y le damos los parametros que pide
        leer.close(); //Se cierra la clase "leer" tipo Scanner
        System.out.println("Ejercicio 2.28 - Version 1.0.1 - Sergio Tarquino");

    }
}
 