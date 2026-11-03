package homework.h08;

// 2824. Count Pairs Whose Sum is Less than Target
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T2 {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0, right = nums.size() - 1, count = 0;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2)); // 3
        System.out.println(sol.countPairs(Arrays.asList(-6, 2, 5, -2, -7, -1, 3), -2)); // 10
    }
}
