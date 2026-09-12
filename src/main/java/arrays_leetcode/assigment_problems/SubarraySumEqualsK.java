package arrays_leetcode.assigment_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * A4. Subarray Sum Equals K
 *
 * Scenario: A hostel warden wants to know how many different contiguous stretches
 * of days had a net change of exactly k.
 *
 * Task: Use running prefix sums combined with a hash map to count subarrays
 * summing to k in O(n) time, O(n) space.
 */
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: empty prefix

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) was seen before, those subarrays sum to k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 1, 1};
        System.out.println("Input: [1, 1, 1], k=2 -> Output: " + subarraySum(nums1, 2));
        // Expected: 2

        // Test case 2
        int[] nums2 = {1, -1, 0};
        System.out.println("Input: [1, -1, 0], k=0 -> Output: " + subarraySum(nums2, 0));
        // Expected: 3
    }
}
