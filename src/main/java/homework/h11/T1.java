package homework.h11;

// 268. Missing Number
// https://leetcode.com/problems/missing-number/
public class T1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.missingNumber(new int[]{3, 0, 1})); // 2
        System.out.println(sol.missingNumber(new int[]{0, 1})); // 2
        System.out.println(sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // 8
    }
}
