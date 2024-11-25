/*
 * 796. Rotate String
 * URL: https://leetcode.com/problems/rotate-string/description/
 */

public class StringRotate {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // If s is a rotation of goal, then s + s will contain goal it means if s is
        // "abcde" and goal is "cdeab", then s + s would be "abcdeabcde", which contains
        // "cdeab".
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        StringRotate sr = new StringRotate();
        System.out.println(sr.rotateString("abcde", "deabc"));
    }
}

// Input: s = "abcde", goal = "cdeab"
// Output: true