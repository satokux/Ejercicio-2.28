public class App {
    public static void main(String[] args) throws Exception {

        Vista vista = new Vista(); //Se instancia el objeto "vista" tipo Vista
        LecturaRadio_int leerRadio = new LecturaRadio_int(); //Se instancia el objeto "leerRadio" tipo LecturaRadio_int
        Diametro calcularDiametro = new Diametro(); //Se instancia el objeto "calcularDiametro" tipo Diametro
        Circunferencia calcularCircunferencia = new Circunferencia(); //Se instancia el objeto "calcularCircunferencia" tipo Circunferencia
        Area calcularArea = new Area(); //Se instancia el objeto "calcularArea" tipo Area
        
        System.out.print("Digite el radio de un circulo: "); //Se pide el valor de "radio" por teclado
        
        Numero_int radio; //Se crea la variable "radio" tipo Numero_int
        double diametro; //Se crea la variable "diametro" tipo flotante
        double circunferencia; //Se crea la variable "circunferencia" tipo flotante
        double area; //Se crea la variable "area" tipo flotante

        radio = leerRadio.leerRadio(); //Se captura el radio mediante el metodo leerRadio()
        diametro = calcularDiametro.calcularDiametro(radio); //Se calcula el Diametro mediante el metodo calcularDiametro()
        circunferencia = calcularCircunferencia.calcularCircunferencia(radio); //Se calcula la Circunferencia mediante el metodo calcularCircunferencia()
        area = calcularArea.calcularArea(radio); //Se calcula el Area mediante el metodo calcularArea()

        vista.mostrarOperaciones(diametro, circunferencia, area); //Llamamos a la clase "Vista" y le damos los parametros que pide
        
        System.out.println("Ejercicio 2.28(ver 1.3.2) - Sergio Tarquino"); //Se imprime: "nombre del programa(versión del programa) - Autor"

    }
}
 