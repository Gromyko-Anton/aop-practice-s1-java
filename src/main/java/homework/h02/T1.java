package homework.h02;

// 258. Add Digits
// https://leetcode.com/problems/add-digits/
public class T1 {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
