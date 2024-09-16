import SearchAlg.BusquedaBinaria;
import SearchAlg.BusquedaLineal;
import SearchAlg.Interpolación;
import Util.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchAlgTest {

    @Test
    public void linearSearchFindsElementInArray() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = BusquedaLineal.buscar(array, 3);
        Assertions.assertEquals(2, index);
    }

    @Test
    public void linearSearchReturnsMinusOneForNonexistentElement() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = BusquedaLineal.buscar(array, 6);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void binarySearchFindsElementInSortedArray() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = BusquedaBinaria.buscar(array, 3);
        Assertions.assertEquals(2, index);
    }

    @Test
    public void binarySearchReturnsMinusOneForNonexistentElement() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = BusquedaBinaria.buscar(array, 6);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void interpolationSearchFindsElementInSortedArray() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = Interpolación.buscar(array, 3);
        Assertions.assertEquals(2, index);
    }

    @Test
    public void interpolationSearchReturnsMinusOneForNonexistentElement() {
        Array<Integer> array = new Array<>(5);
        for (int i = 0; i < 5; i++) {
            array.setElement(i, i+1);
        }
        int index = Interpolación.buscar(array, 6);
        Assertions.assertEquals(-1, index);
    }
}