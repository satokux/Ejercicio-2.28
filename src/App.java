public class App {
    public static void main(String[] args) throws Exception {

        
        
        Vista vista = new Vista(); //Se instancia la clase "vista" tipo Vista
        Lectura_Radio leerRadio = new Lectura_Radio(); 

        System.out.print("Digite el radio de un circulo: "); //Se pide el valor de "radio" por teclado
        
        Numero radio = leerRadio.leerRadio(); ;
        double diametro; //Se crea la variable "diametro" tipo flotante
        double circunferencia; //Se crea la variable "circunferencia" tipo flotante
        double area; //Se crea la variable "area" tipo flotante

        diametro = 2 * radio.getNumero(); //Se calcula el Diametro = (2r)
        circunferencia = 2 * Math.PI * radio.getNumero(); //Se calcula la Circunferencia = (2πr)
        area = Math.PI * Math.pow(radio.getNumero(), 2); //Se calcula el Area = (πr^2)

        vista.mostrarOperaciones(diametro, circunferencia, area); //Llamamos a la clase "Vista" y le damos los parametros que pide
        
        System.out.println("Ejercicio 2.28 - Sergio Tarquino (ver 1.2.1)");

    }
}
 