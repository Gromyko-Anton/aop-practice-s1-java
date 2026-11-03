package homework.h04;

// 476. Number Complement
// https://leetcode.com/problems/number-complement/
public class T2 {
    public int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }
        return num ^ mask;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.findComplement(5)); // 2
        System.out.println(sol.findComplement(1)); // 0
    }
}
