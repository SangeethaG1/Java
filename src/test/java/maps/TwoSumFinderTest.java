package maps;

import static org.junit.Assert.*;
import org.junit.Test;

public class TwoSumFinderTest {

    @Test
    public void testFindTwoSumIndices() {
        // Test case 1: Positive case
        int[] input1 = {10, 20, 30, 40, 50, 60};
        int target1 = 100;
        int[] expected1 = {3, 5};
        assertArrayEquals(expected1, TwoSumFinder.findTwoSumIndices(input1, target1));

        // Test case 2: No solution
        int[] input2 = {10, 20, 30, 40, 50, 60};
        int target2 = 200;
        int[] expected2 = {-1, -1};
        assertArrayEquals(expected2, TwoSumFinder.findTwoSumIndices(input2, target2));

        // Test case 3: Duplicate numbers
        int[] input3 = {5, 10, 15, 20, 25, 30, 5};
        int target3 = 10;
        int[] expected3 = {0, 6};
        assertArrayEquals(expected3, TwoSumFinder.findTwoSumIndices(input3, target3));

        // Test case 4: Empty array
        int[] input4 = {};
        int target4 = 50;
        int[] expected4 = {-1, -1};
        assertArrayEquals(expected4, TwoSumFinder.findTwoSumIndices(input4, target4));
    }
}