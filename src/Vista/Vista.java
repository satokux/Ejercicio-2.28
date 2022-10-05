package Vista;
import java.text.DecimalFormat;
public class Vista {

DecimalFormat formato = new DecimalFormat("#.##"); //Se crea la variable "formato" tipo DecimalFormat

    public void mostrarOperaciones(double diametro, double circunferencia, double area){ //metodo mostrarOperaciones()
        System.out.println("El Diametro es: " + diametro); //Imprime el Diametro
        System.out.println("La Circunferencia es: " + formato.format(circunferencia)); //Imprime la Circunferencia
        System.out.println("El Area: " + formato.format(area)); //Imprime el Area
    }

    public void mostrarPedirNumero(){
        System.out.print("Digite el radio de un circulo: "); //Se pide el valor de "radio" por teclado
    }

    public void mostrarVersion(){
        System.out.println("Ejercicio 2.28(ver 2.0.0) - Sergio Tarquino"); //Se imprime: "nombre del programa(versión del programa) - Autor"
    }
}
 