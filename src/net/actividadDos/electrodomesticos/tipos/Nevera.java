package net.actividadDos.electrodomesticos.tipos;

import net.actividadDos.electrodomesticos.Electrodomestico;

public class Nevera extends Electrodomestico {

    private float temperatura;

    public Nevera(String marca, String modelo, float peso, float potencia, float temperatura) {
        super(marca, modelo, peso, potencia);
        this.temperatura = temperatura;

    }

    @Override
    public String estaEncendida() {
        System.out.println("Ños, fuerte pelete!");

        return estaEncendida = "Sí";

    }

    @Override
    public String toString() {

        return "------------------------ " + "\n* Tipo de electrodoméstico: Nevera." + "\nMarca: " + getMarca()
                + "\nModelo: " + getModelo() + "\nPeso: " + getPeso() + " kg" + "\nPeso: " + getPeso() + "\nPotencia: "
                + getPotencia() + "\nTemperatura: " + this.temperatura + "\nEstá encendido: " + estaEncendida
                + "\n------------------------ ";
    }

}
