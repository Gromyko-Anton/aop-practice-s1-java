package homework.h07;

// 412. Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/
import java.util.ArrayList;
import java.util.List;

public class T1 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        T1 sol = new T1();
        System.out.println(sol.fizzBuzz(3));  // [1, 2, Fizz]
        System.out.println(sol.fizzBuzz(5));  // [1, 2, Fizz, 4, Buzz]
        System.out.println(sol.fizzBuzz(15)); // ... FizzBuzz
    }
}
