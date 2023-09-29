package Controlador;

import java.util.Date;

public class Cria {
    private int cod;
    private double peso;
    private Date fechadenacimiento;
    private Date fechadeinseminacion;
    private Date fechadeparicion;
    private String raza;
    private int padres;
    private String categoria;
    private String color;
    private String pintada;
    private int caravana;
    private String celo;
    private String prenies;
    private String observaciones;

    public Cria(int cod, double peso, Date fechadenacimiento, Date fechadeinseminacion, Date fechadeparicion, String raza, int padres, String categoria, String color, String pintada, int caravana, String celo, String prenies, String observaciones) {
        this.cod = cod;
        this.peso = peso;
        this.fechadenacimiento = fechadenacimiento;
        this.fechadeinseminacion = fechadeinseminacion;
        this.fechadeparicion = fechadeparicion;
        this.raza = raza;
        this.padres = padres;
        this.categoria = categoria;
        this.color = color;
        this.pintada = pintada;
        this.caravana = caravana;
        this.celo = celo;
        this.prenies = prenies;
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

    public Date getFechadeinseminacion() {
        return fechadeinseminacion;
    }

    public void setFechadeinseminacion(Date fechadeinseminacion) {
        this.fechadeinseminacion = fechadeinseminacion;
    }

    public Date getFechadeparicion() {
        return fechadeparicion;
    }

    public void setFechadeparicion(Date fechadeparicion) {
        this.fechadeparicion = fechadeparicion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPadres() {
        return padres;
    }

    public void setPadres(int padres) {
        this.padres = padres;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPintada() {
        return pintada;
    }

    public void setPintada(String pintada) {
        this.pintada = pintada;
    }

    public int getCaravana() {
        return caravana;
    }

    public void setCaravana(int caravana) {
        this.caravana = caravana;
    }

    public String getCelo() {
        return celo;
    }

    public void setCelo(String celo) {
        this.celo = celo;
    }

    public String getPrenies() {
        return prenies;
    }

    public void setPrenies(String prenies) {
        this.prenies = prenies;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Controlador.Cria{" +
                "cod=" + cod +
                ", peso=" + peso +
                ", fechadenacimiento=" + fechadenacimiento +
                ", fechadeinseminacion=" + fechadeinseminacion +
                ", fechadeparicion=" + fechadeparicion +
                ", raza='" + raza + '\'' +
                ", padres=" + padres +
                ", categoria='" + categoria + '\'' +
                ", color='" + color + '\'' +
                ", pintada='" + pintada + '\'' +
                ", caravana=" + caravana +
                ", celo='" + celo + '\'' +
                ", prenies='" + prenies + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
