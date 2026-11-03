package homework.h02;

// 2119. A Number After a Double Reversal
// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class T2 {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.isSameAfterReversals(526)); // true
        System.out.println(sol.isSameAfterReversals(1800)); // false
        System.out.println(sol.isSameAfterReversals(0)); // true
    }
}
