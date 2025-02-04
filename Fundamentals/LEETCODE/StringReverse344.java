/*
 * 344. Reverse String
 * URL: https://leetcode.com/problems/reverse-string/description
 */


public class StringReverse344 {
    public void reverseString() {
        char[] arr = new char[5];
        char temp;
        char[] arr2 = new char[5];

        arr[0] = 'h';
        arr[1] = 'e';
        arr[2] = 'l';
        arr[3] = 'l';
        arr[4] = 'o';

        for(int i = 5; i > 0; i--){
            temp = arr[i - 1];
            System.out.println(temp);
            
        }
    }

    public static void main(String[] args) {
        StringReverse344 s = new StringReverse344();
        s.reverseString();
    }
}