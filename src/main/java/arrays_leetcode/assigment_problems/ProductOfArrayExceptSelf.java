package arrays_leetcode.assigment_problems;

/**
 * A1. Product of Array Except Self
 *
 * Scenario: A pricing engine needs, for every product in a bundle, the combined
 * price of every OTHER product — without ever dividing by the current product's price.
 *
 * Task: Return an array where answer[i] is the product of every element except nums[i],
 * solved in O(n) time using two passes (prefix and suffix products), no division.
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: accumulate left products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Backward pass: multiply in right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = productExceptSelf(nums1);
        System.out.print("Input: [1, 2, 3, 4] -> Output: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Test case 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        System.out.print("Input: [-1, 1, 0, -3, 3] -> Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
