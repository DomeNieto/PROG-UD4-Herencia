import net.actividadDos.electrodomesticos.tipos.Microondas;
import net.actividadDos.electrodomesticos.tipos.Nevera;

public class ActividadDos {
    public static void main(String[] args) {
        Nevera nevera = new Nevera("Casio", "Nueva", 100, 100, 82);
        nevera.estaEncendida();
        System.out.println(nevera.toString());
        nevera.apagar();
        System.out.println(nevera.toString());

        Microondas microondas = new Microondas("Lola", "Viejo", 120, 104, "Cerrada");
        microondas.estaEncendida();
        System.out.println(microondas.toString());
        microondas.apagar();
        System.out.println(microondas.toString());

    }
}
