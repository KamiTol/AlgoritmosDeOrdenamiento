package SearchAlg;

import Util.Array;

public class Interpolación {
    public static <T extends Comparable<T>> int buscar(Array<T> array, T valor) {
        int low = 0;
        int high = array.getSize() - 1;

        while (low <= high && valor.compareTo(array.getElement(low)) >= 0 && valor.compareTo(array.getElement(high)) <= 0) {
            int mid = low + ((valor.compareTo(array.getElement(low))) * (high - low) / (array.getElement(high).compareTo(array.getElement(low))));

            if (array.getElement(mid).equals(valor)) {
                return mid;
            }

            if (array.getElement(mid).compareTo(valor) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}