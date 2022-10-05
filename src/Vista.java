import java.text.DecimalFormat;

public class Vista {

DecimalFormat formato = new DecimalFormat("#.##"); //Se crea la variable "formato" tipo DecimalFormat

    public void mostrarOperaciones(double diametro, double circunferencia, double area){ //metodo mostrarOperaciones()
        System.out.println("El Diametro es: " + diametro); //Imprime el Diametro
        System.out.println("La Circunferencia es: " + formato.format(circunferencia)); //Imprime la Circunferencia
        System.out.println("El Area: " + formato.format(area)); //Imprime el Area
    }

        
}
 