package homework.h05;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        SolutionH05 solution = new SolutionH05();

        int[] nums1 = {5, 6, 2, 7, 4};
        System.out.println(solution.maxProductDifference(nums1)); // 34

        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        System.out.println(solution.maxProductDifference(nums2)); // 64
    }
}

class SolutionH05 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}