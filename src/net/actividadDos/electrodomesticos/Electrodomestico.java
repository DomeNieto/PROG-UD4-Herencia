package net.actividadDos.electrodomesticos;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private float peso;
    private float potencia;
    protected String estaEncendida;

    public Electrodomestico(String marca, String modelo, float peso, float potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String estaEncendida() {

        return estaEncendida = "Sí";

    }

    public String apagar() {

        return estaEncendida = "No";

    }
}
