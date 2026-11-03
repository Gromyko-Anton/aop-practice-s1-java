package homework.h11;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/
public class T2 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.majorityElement(new int[]{3, 2, 3})); // 3
        System.out.println(sol.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // 2
    }
}
