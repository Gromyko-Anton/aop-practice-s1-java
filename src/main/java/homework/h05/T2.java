package homework.h05;

// 977. Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class T2 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-4, -1, 0, 3, 10}))); // [0, 1, 9, 16, 100]
        System.out.println(Arrays.toString(sol.sortedSquares(new int[]{-7, -3, 2, 3, 11}))); // [4, 9, 9, 49, 121]
    }
}
