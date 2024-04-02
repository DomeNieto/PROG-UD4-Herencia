import net.actividaUno.MetodosEstaticos;

public class ActividadUno {
    public static void main(String[] args) throws Exception {
        int[] notas = { 10, 4, 6, 1, 7 };
        int[] otrasNotas = { 4, 7, 9, 2, 3, 7, 8 };

        MetodosEstaticos.sumarElevadosN(3);
        MetodosEstaticos.sumarElevadosN(6);
        MetodosEstaticos.sumarElevadosN(73);

        MetodosEstaticos.calcularMedia(notas);
        MetodosEstaticos.calcularMedia(otrasNotas);

    }
}
