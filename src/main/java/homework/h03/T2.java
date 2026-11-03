package homework.h03;

// 2894. Divisible and Non-divisible Sums Difference
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
public class T2 {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0; // not divisible by m
        int sum2 = 0; // divisible by m
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum2 += i;
            } else {
                sum1 += i;
            }
        }
        return sum1 - sum2;
    }
}
