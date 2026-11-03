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
}
