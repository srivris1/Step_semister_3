package arrays_leetcode.assigment_problems;

/**
 * A5. Find Minimum in Rotated Sorted Array
 *
 * Scenario: A circular duty roster was originally sorted, then "rotated" at some
 * unknown point. Find the original earliest join date using binary search.
 *
 * Task: Use a modified binary search — compare mid element to rightmost to decide
 * which half contains the minimum. Solve in O(log n) time.
 */
public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half (including mid)
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Input: [3, 4, 5, 1, 2] -> Output: " + findMin(nums1));
        // Expected: 1

        // Test case 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Input: [4, 5, 6, 7, 0, 1, 2] -> Output: " + findMin(nums2));
        // Expected: 0

        // Test case 3
        int[] nums3 = {11, 13, 15, 17};
        System.out.println("Input: [11, 13, 15, 17] -> Output: " + findMin(nums3));
        // Expected: 11
    }
}
