package Strings;

public class Problem28 {
    public int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
       
    }   

    public static void main(String[] args) {
        Problem28 p = new Problem28();
        String haystack = "hello";
        String needle = "hel";
        System.out.println(p.strStr(haystack, needle));
    }
}
