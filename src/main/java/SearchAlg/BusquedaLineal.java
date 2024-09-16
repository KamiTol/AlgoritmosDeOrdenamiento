package SearchAlg;

import Util.Array;

public class BusquedaLineal {
    public static <T extends Comparable<T>> int buscar(Array<T> array, T valor) {
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getElement(i).equals(valor)) {
                return i;
            }
        }
        return -1;
    }
}