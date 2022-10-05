public class App {
    public static void main(String[] args) throws Exception {

        Vista vista = new Vista(); //Se instancia el objeto "vista" tipo Vista
        LecturaRadio_int leerRadio = new LecturaRadio_int(); //Se instancia el objeto "leerRadio" tipo LecturaRadio_int
        Diametro calcularDiametro = new Diametro(); //Se instancia el objeto "calcularDiametro" tipo Diametro

        System.out.print("Digite el radio de un circulo: "); //Se pide el valor de "radio" por teclado
        
        Numero_int radio;
        double diametro; //Se crea la variable "diametro" tipo flotante
        double circunferencia; //Se crea la variable "circunferencia" tipo flotante
        double area; //Se crea la variable "area" tipo flotante

        radio = leerRadio.leerRadio();
        diametro = calcularDiametro.calcular(radio); //Se calcula el Diametro = (2r)
        circunferencia = 2 * Math.PI * radio.getNumero_int(); //Se calcula la Circunferencia = (2πr)
        area = Math.PI * Math.pow(radio.getNumero_int(), 2); //Se calcula el Area = (πr^2)

        vista.mostrarOperaciones(diametro, circunferencia, area); //Llamamos a la clase "Vista" y le damos los parametros que pide
        
        System.out.println("Ejercicio 2.28(ver 1.3.0) - Sergio Tarquino");

    }
}
 