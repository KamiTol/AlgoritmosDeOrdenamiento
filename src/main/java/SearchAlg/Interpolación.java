package SearchAlg;

import Util.Array;

public class Interpolación {
    public static <T extends Comparable<T>> int buscar(Array<T> array, T valor) {
        int inicio = 0;
        int fin = array.getSize() - 1;

        while (inicio <= fin && valor.compareTo(array.getElement(inicio)) >= 0 && valor.compareTo(array.getElement(fin)) <= 0) {
            int pos = inicio + (((fin-inicio) / (array.getElement(fin).compareTo(array.getElement(inicio)))) * (valor.compareTo(array.getElement(inicio))));

            if (array.getElement(pos).equals(valor)) {
                return pos;
            }

            if (array.getElement(pos).compareTo(valor) < 0) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
    }
}