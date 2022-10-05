public class Area {
    private Numero_int a; //Se define el atributo a

    //constructor vacio
    public Area() {
    }

    //constructor con atributos
    public Area(Numero_int a) {
        this.a = a;
    }

    //Getters & Setters
    public Numero_int getA() {
        return a;
    }

    public void setA(Numero_int a) {
        this.a = a;
    }

    public double calcularArea(Numero_int a){ //metodo calcularArea
        double rad = a.getNumero_int(); //Se crea variable "rad" donde se almacena el valor capturado con a
        double area = Math.PI * Math.pow(rad, 2); //Se crea variable "area" donde se almacena la operacion para hallar el area = (πr^2)
        return area; //Retorna "area"
    }
}
