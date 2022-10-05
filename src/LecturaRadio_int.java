import java.util.Scanner;
public class LecturaRadio_int {
    public Numero_int leerRadio(){

        Numero_int radio = new Numero_int(); //Se instancia la clase "radio" tipo Numero
        Scanner leer = new Scanner(System.in); //Se instancia la clase "leer" tipo Scanner
        int r = leer.nextInt(); //Se captura el valor dado por el usuario en "r"
        radio.setNumero_int(r); //Se asigna el valor de "r" a "radio" 
        leer.close(); //Se cierra la clase "leer" tipo Scanner
        return radio; //Se retorna el valor de "radio"
    }//Fin del metodo leerRadio
   
    
}
