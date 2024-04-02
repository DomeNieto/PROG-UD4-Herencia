package net.actividaUno;

public class MetodosEstaticos {

    public static void sumarElevadosN(int n) {
        int operacion = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                operacion += i * i;

            }
            System.out.println("El resultado de la operacion es: " + operacion);

        } else {
            System.out.println("El numero no es positivo");
        }

    }

    public static void calcularMedia(int[] notas) {
        float suma = 0;
        float resultado = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            resultado = suma / notas.length;
        }
        System.out.println("El resultado de la media de notas es: " + resultado);

    }

}
