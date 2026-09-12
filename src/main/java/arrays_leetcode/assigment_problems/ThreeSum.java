package arrays_leetcode.assigment_problems;

import java.util.Arrays;

/**
 * A3. 3Sum
 *
 * Scenario: A budgeting tool needs to find every distinct combination of exactly
 * three transactions that cancel each other out (sum to zero).
 *
 * Task: Sort the array, then for each element use two pointers to find pairs
 * that complete the sum to zero, skipping duplicates at every level.
 * Time: O(n^2), Space: O(1) extra.
 */
public class ThreeSum {

    public static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Worst case: collect up to n*n triplets (over-allocate, then trim)
        int[][] tempResult = new int[n * n][3];
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    tempResult[count] = new int[]{nums[i], nums[left], nums[right]};
                    count++;

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Trim to actual size
        int[][] result = new int[count][3];
        for (int i = 0; i < count; i++) {
            result[i] = tempResult[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[][] result1 = threeSum(nums1);
        System.out.print("Input: [-1, 0, 1, 2, -1, -4] -> Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(Arrays.toString(result1[i]));
            if (i < result1.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Test case 2
        int[] nums2 = {0, 0, 0};
        int[][] result2 = threeSum(nums2);
        System.out.print("Input: [0, 0, 0] -> Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(Arrays.toString(result2[i]));
            if (i < result2.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
