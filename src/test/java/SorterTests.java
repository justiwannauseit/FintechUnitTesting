import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorterTests {

    @Test
    public void simpleTest() {
        int[] exampleArray = {43, 5, 6, 14, 199, 19, 1};
        SorterProgram.sort(exampleArray);
        Assertions.assertNotNull(exampleArray);
    }

    @Test
    public void sortedArrayTest() {
        int[] exampleArray = {1,2,3,4,5,6};
        int[] sortedArray = {1,2,3,4,5,6};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }


    @Test
    public void positiveOnlyArrayTest() {
        int[] exampleArray = {4, 5, 18, 144};
        int[] sortedArray = {4,5,18,144};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }

    @Test
    public void negativeOnlyArrayTest() {
        int[] exampleArray = {-4, -5, -2, -144, -1};
        int[] sortedArray = {-144,-5,-4,-2,-1};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }


    @Test
    public void standardArraySortingTest() {
        int[] exampleArray = {8000,15,39,1,-7};
        int[] exampleArrayClone = {-7,1,15,39,8000};
        SorterProgram.sort(exampleArray);
        Arrays.sort(exampleArrayClone);
        Assertions.assertArrayEquals(exampleArrayClone, exampleArray);
    }

    @Test
    public void repeatingArraySortingTest() {
        int[] exampleArray = {1, 2, 3, 1, 2, 3, 1, 5, 6, 1, 1, 1};
        int[] exampleArrayClone = {1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 5, 6};
        SorterProgram.sort(exampleArray);
        Arrays.sort(exampleArrayClone);
        Assertions.assertArrayEquals(exampleArrayClone, exampleArray);
    }


    @Test
    public void identicalArraySortingTest() {
        int[] exampleArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] exampleArrayClone = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        SorterProgram.sort(exampleArray);
        Arrays.sort(exampleArrayClone);
        Assertions.assertArrayEquals(exampleArrayClone, exampleArray);
    }

    @Test
    public void checkEmptyArrayTest(){
        int[] exampleArray = {};
        int[] sortedArray = {};
        SorterProgram.sort(exampleArray);
        Assertions.assertArrayEquals(sortedArray, exampleArray);
    }


}
