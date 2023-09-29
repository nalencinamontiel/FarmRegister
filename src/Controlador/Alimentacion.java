package Controlador;

public class Alimentacion {
    private int cod;
    private String tipodealimentacion;
    private String denom;
    private double cantporanimal;

    public Alimentacion(int cod, String tipodealimentacion, String denom, double cantporanimal) {
        this.cod = cod;
        this.tipodealimentacion = tipodealimentacion;
        this.denom = denom;
        this.cantporanimal = cantporanimal;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipodealimentacion() {
        return tipodealimentacion;
    }

    public void setTipodealimentacion(String tipodealimentacion) {
        this.tipodealimentacion = tipodealimentacion;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public double getCantporanimal() {
        return cantporanimal;
    }

    public void setCantporanimal(double cantporanimal) {
        this.cantporanimal = cantporanimal;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Controlador.Alimentacion{" +
                "cod=" + cod +
                ", tipodealimentacion='" + tipodealimentacion + '\'' +
                ", denom='" + denom + '\'' +
                ", cantporanimal=" + cantporanimal +
                '}';
    }
}
