public class Diametro {
    private Numero_int r; //Se define el atributo r

    //constructor vacio
    public Diametro() {
    }

    //constructor con atributos
    public Diametro(Numero_int r) {
        this.r = r;
    }

    //Getters & Setters
    public Numero_int getR() {
        return r;
    }

    public void setR(Numero_int r) {
        this.r = r;
    }

    public double calcularDiametro(Numero_int r){ //metodo calcularDiametro
        double rad = r.getNumero_int(); //Se crea variable "rad" donde se almacena el valor capturado con r
        double diametro = rad*2; //Se crea variable "diametro" donde se almacena la operacion para hallar el diametro = (2r)
        return diametro; //Retorna "diametro"
    }

    

    
    
}
