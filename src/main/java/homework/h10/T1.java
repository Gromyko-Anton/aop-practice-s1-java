package homework.h10;

// 3304. Find the K-th Character in String Game I
// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
    public char kthCharacter(int k) {
        int shifts = Integer.bitCount(k - 1);
        return (char) ('a' + shifts);
    }
}
