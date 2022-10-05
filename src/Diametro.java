public class Diametro {
    private Numero_int r; //Se define el atributo r

    public Diametro() {
    }

    public Diametro(Numero_int r) {
        this.r = r;
    }

    public Numero_int getR() {
        return r;
    }

    public void setR(Numero_int r) {
        this.r = r;
    }

    public double calcular(Numero_int r){//metodo calcularDiametro
        double rad = r.getNumero_int();
        double diametro = rad*2;
        return diametro;

    }

    

    
    
}
