import java.util.Scanner;
public class Lectura_Radio {
    public Numero leerRadio(){

        Numero radio = new Numero(); //Se instancia la clase "radio" tipo Numero
        Scanner leer = new Scanner(System.in); //Se instancia la clase "leer" tipo Scanner
        int r = leer.nextInt(); //Se captura el valor dado por el usario en "r"
        radio.setNumero(r); //Se asigna el valor de "r" a "radio" 
        leer.close(); //Se cierra la clase "leer" tipo Scanner
        return radio; //Se retorna el valor de "radio"
    }//Fin del metodo leerRadio
   
    
}
