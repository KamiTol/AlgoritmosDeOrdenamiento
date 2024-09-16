package SearchAlg;

import Util.Array;

public class BusquedaBinaria {
    public static <T extends Comparable<T>> int buscar(Array<T> array, T valor) {
        int inicio = 0;
        int fin = array.getSize() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = valor.compareTo(array.getElement(medio));

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }
}