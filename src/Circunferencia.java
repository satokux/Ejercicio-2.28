public class Circunferencia {
    private Numero_int c; //Se define el atributo c

    //constructor vacio
    public Circunferencia() {
    }

    //constructor con atributos
    public Circunferencia(Numero_int c) {
        this.c = c;
    }

    //Getters & Setters
    public Numero_int getC() {
        return c;
    }

    public void setC(Numero_int c) {
        this.c = c;
    }

    public double calcularCircunferencia(Numero_int c){ //metodo calcularCircunferencia
        double rad = c.getNumero_int(); //Se crea variable "rad" donde se almacena el valor capturado con c
        double circunferencia = rad*2*Math.PI; //Se crea variable "circunferencia" donde se almacena la operacion para hallar la circunferencia = (2πr)
        return circunferencia; //Retorna "circunferencia"
    }

    

    

    
    
    
    
}
