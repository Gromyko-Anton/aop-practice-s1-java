package homework.h09;

// 1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class T1 {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int pairs = 0;
        for (int num : nums) {
            pairs += count[num];
            count[num]++;
        }
        return pairs;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
        System.out.println(sol.numIdenticalPairs(new int[]{1, 1, 1, 1})); // 6
        System.out.println(sol.numIdenticalPairs(new int[]{1, 2, 3})); // 0
    }
}
