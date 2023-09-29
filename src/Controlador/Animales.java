package Controlador;

public class Animales {
    private int cod;
    private int engorde;
    private int cria;

    public Animales(int cod, int engorde, int cria) {
        this.cod = cod;
        this.engorde = engorde;
        this.cria = cria;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getEngorde() {
        return engorde;
    }

    public void setEngorde(int engorde) {
        this.engorde = engorde;
    }

    public int getCria() {
        return cria;
    }

    public void setCria(int cria) {
        this.cria = cria;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Controlador.Animales{" +
                "cod=" + cod +
                ", engorde=" + engorde +
                ", cria=" + cria +
                '}';
    }
    public void
}
