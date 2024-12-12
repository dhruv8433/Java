/*
 * 344. Reverse String
 * URL: https://leetcode.com/problems/reverse-string/description
 */

import java.util.Arrays;

public class StringReverse344 {
    public void reverseString(char[] s) {
        char[] reversedString = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            for (int j = 0; j < s.length; j++) {
                reversedString[j] = s[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(reversedString));
    }

    public static void main(String[] args) {
        StringReverse344 s = new StringReverse344();
        s.reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
    }
}