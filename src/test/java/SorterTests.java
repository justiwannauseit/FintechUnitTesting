import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorterTests {

    @Test
    public void simpleTest() {
        int[] exampleArray = {43, 5, 6, 14, 199, 19, -1};
        int[] sortedArray = {-1, 5, 6, 14, 19, 43, 199};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }

    @Test
    public void evenLengthArrayTest() {
        int[] exampleArray = {-4, -5, 18, -144};
        int[] sortedArray = {-144, -5, -4, 18};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }

    @Test
    public void oddLengthArrayTest() {
        int[] exampleArray = {-4, -5, 18, -144, 1};
        int[] sortedArray = {-144, -5, -4, 1, 18};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }


    @Test
    public void standardArraySortingTest() {
        int[] exampleArray = {-1, 2, -8, 77, -458, -654312, 456456, 15, -2, 0, 2, 8, -35656, 54456, -84, 6511, 3212, 987498, -5566};
        int[] exampleArrayClone = {-1, 2, -8, 77, -458, -654312, 456456, 15, -2, 0, 2, 8, -35656, 54456, -84, 6511, 3212, 987498, -5566};
        SorterProgram.sort(exampleArray);
        Arrays.sort(exampleArrayClone);
        Assertions.assertArrayEquals(exampleArrayClone, exampleArray);

    }

    @Test
    public void checkTypeArrayTest() {
        int[] exampleArray = {0,1,8,3};
        String [] sortedArray = {"0","1","3","8"};
        SorterProgram.sort(exampleArray);
        Assertions.assertNotEquals(sortedArray, exampleArray);
    }

}
