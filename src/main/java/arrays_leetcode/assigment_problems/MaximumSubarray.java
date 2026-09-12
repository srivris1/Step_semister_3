package arrays_leetcode.assigment_problems;

/**
 * A2. Maximum Subarray (Kadane's Algorithm)
 *
 * Scenario: A trader wants to know the single best contiguous stretch of days —
 * the run of consecutive days whose combined total is the highest possible.
 *
 * Task: Find the contiguous subarray (at least one number) with the largest sum.
 * Solve using Kadane's algorithm in O(n) time, O(1) space.
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide: extend current subarray or start fresh
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> Output: " + maxSubArray(nums1));
        // Expected: 6

        // Test case 2
        int[] nums2 = {-3, -1, -2};
        System.out.println("Input: [-3, -1, -2] -> Output: " + maxSubArray(nums2));
        // Expected: -1
    }
}
