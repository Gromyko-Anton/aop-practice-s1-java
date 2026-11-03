package homework.h04;

// 461. Hamming Distance
// https://leetcode.com/problems/hamming-distance/
public class T1 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.hammingDistance(1, 4)); // 2
        System.out.println(sol.hammingDistance(3, 1)); // 1
    }
}
