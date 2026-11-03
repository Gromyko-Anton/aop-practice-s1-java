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
}
