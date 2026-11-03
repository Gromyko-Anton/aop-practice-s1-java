package homework.h05;

// 1913. Maximum Product Difference Between Two Pairs
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
import java.util.Arrays;

public class T1 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.maxProductDifference(new int[]{5, 6, 2, 7, 4})); // 34
        System.out.println(sol.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8})); // 64
    }
}
