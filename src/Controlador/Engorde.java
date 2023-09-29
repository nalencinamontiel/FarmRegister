package Controlador;

import java.util.Date;

public class Engorde {
    private int cod;
    private double peso;
    private Date fechadenacimiento;
    private String raza;
    private String categoria;
    private int caravana;
    private String color;
    private String observaciones;

    public Engorde(int cod, double peso, Date fechadenacimiento, String raza, String categoria, int caravana, String color, String observaciones) {
        this.cod = cod;
        this.peso = peso;
        this.fechadenacimiento = fechadenacimiento;
        this.raza = raza;
        this.categoria = categoria;
        this.caravana = caravana;
        this.color = color;
        this.observaciones = observaciones;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCaravana() {
        return caravana;
    }

    public void setCaravana(int caravana) {
        this.caravana = caravana;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Controlador.Engorde{" +
                "cod=" + cod +
                ", peso=" + peso +
                ", fechadenacimiento=" + fechadenacimiento +
                ", raza='" + raza + '\'' +
                ", categoria='" + categoria + '\'' +
                ", caravana=" + caravana +
                ", color='" + color + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}