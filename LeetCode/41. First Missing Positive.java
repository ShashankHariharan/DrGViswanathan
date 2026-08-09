class Solution {

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Put every valid positive number
        // into its correct position.
        for (int i = 0; i < n; i++) {

            while (nums[i] > 0 &&
                   nums[i] <= n &&
                   nums[i] != nums[nums[i] - 1]) {

                int correctIndex = nums[i] - 1;

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Find the first position containing
        // the wrong number.
        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // All 1..n are present.
        return n + 1;
    }
}