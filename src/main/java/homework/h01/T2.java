package homework.h01;

// 1523. Count Odd Numbers in an Interval Range
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class T2 {
    public int countOdds(int low, int high) {
        return ((high + 1) >> 1) - (low >> 1);
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.countOdds(3, 7)); // 3
        System.out.println(sol.countOdds(8, 10)); // 1
    }
}
