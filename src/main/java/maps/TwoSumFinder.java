package maps;

import java.util.HashMap;

public class TwoSumFinder {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            numIndices.put(nums[i], i);
        }

        // If no solution is found
        return new int[]{-1, -1};
    }
}
