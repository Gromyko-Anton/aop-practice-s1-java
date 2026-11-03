package homework.h07;

// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.numberOfSteps(14)); // 6
        System.out.println(sol.numberOfSteps(8));  // 4
        System.out.println(sol.numberOfSteps(123)); // 12
    }
}
