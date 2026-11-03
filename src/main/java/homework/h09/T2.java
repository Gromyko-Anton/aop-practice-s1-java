package homework.h09;

// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;

public class T2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        System.out.println(sol.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // [true, true, true, false, true]
        System.out.println(sol.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // [true, false, false, false, false]
    }
}
