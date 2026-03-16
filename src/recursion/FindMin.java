package recursion;

/*
Problem: find the min value in array using recursive
Approach:
1. compare result from index i
2. recurse index i + 1
3. base case: i == array.length
Time: O(n)
Space: O(n)
*/
public class FindMin {
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array cannot be null or empty");

        return findMin(nums, 1, nums[0]);
    }

    public static int findMin(int[] nums, int i, int minimum) {
        if (i == nums.length) {
            return minimum;
        }

        if (nums[i] < minimum) {
            minimum = nums[i];
        }
        return findMin(nums, i + 1, minimum);
    }
}
