package homework.h03;

// 1491. Average Salary Excluding the Minimum and Maximum Salary
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.average(new int[]{4000, 3000, 1000, 2000})); // 2500.0
        System.out.println(sol.average(new int[]{1000, 2000, 3000})); // 2000.0
    }
}
