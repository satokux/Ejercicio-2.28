package Modelo;

public class Modelo {
    Diametro diametro;
    Circunferencia circunferencia;
    Area area;
    
    public Modelo() {
    }

    public Modelo(Diametro diametro) {
        this.diametro = diametro;
    }

    public Modelo(Circunferencia circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Modelo(Area area) {
        this.area = area;
    }

    public Diametro getDiametro() {
        return diametro;
    }

    public void setDiametro(Diametro diametro) {
        this.diametro = diametro;
    }

    public Circunferencia getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(Circunferencia circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    

    

    

    
}
