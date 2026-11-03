package homework.h10;

// 344. Reverse String
// https://leetcode.com/problems/reverse-string/
public class T2 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        T2 sol = new T2();
        char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(arr1);
        System.out.println(arr1); // olleh

        char[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        sol.reverseString(arr2);
        System.out.println(arr2); // hannaH
    }
}
