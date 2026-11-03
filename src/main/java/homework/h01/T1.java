package homework.h01;

// 2413. Smallest Even Multiple
// https://leetcode.com/problems/smallest-even-multiple/
public class T1 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.smallestEvenMultiple(5)); // 10
        System.out.println(sol.smallestEvenMultiple(6)); // 6
    }
}
