package Strings;

public class Problem392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            while (j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    System.out.println(s.charAt(i) + " " + t.charAt(j));
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            if (i == s.length()) {
                return true;
            }
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Problem392 pb = new Problem392();
        boolean value = pb.isSubsequence("abd", "abcde");
        System.out.println(value);
    }
}
