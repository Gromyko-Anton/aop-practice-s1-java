package homework.h08;

// 485. Max Consecutive Ones
// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})); // 3
        System.out.println(sol.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})); // 2
    }
}
