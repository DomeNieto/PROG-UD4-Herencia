package net.actividadDos.electrodomesticos.tipos;

import net.actividadDos.electrodomesticos.Electrodomestico;

public class Microondas extends Electrodomestico {

    private String puertaAbierta;

    public Microondas(String marca, String modelo, float peso, float potencia, String puertaAbierta) {
        super(marca, modelo, peso, potencia);
        this.puertaAbierta = puertaAbierta;

    }

    @Override
    public String estaEncendida() {
        System.out.println("Algo huele a quemado");
        return estaEncendida = "Sí";

    }

    @Override
    public String toString() {
        return "------------------------ " + "\n* Tipo de electrodoméstico: Microondas." + "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo() + "\nPeso: " + getPeso() + "\nPeso: " + getPeso() + " kg" + "\nPotencia: "
                + getPotencia() + "\nPuerta: " + this.puertaAbierta + "\nEstá encendido: " + estaEncendida
                + "\n ------------------------ ";
    }

}
