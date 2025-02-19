package Strings;

public class ReplaceChar {
    public int lengthOfLastWord(String s) {
        String n = s.strip();

        int len = 0;
        if(n.length() > 0){
            len = n.length() - 1;
        }else{
            len = n.length();
        }

        int out = 0;

        for (int i = len; i >= 0; i--) {
            if (n.charAt(i) == ' ') {
                break;
            } else {
                out++;
            }
            System.out.println(n.length());
            // System.out.println("At index i : " + n.charAt(i));
        }

        return out;
    }

    public static void main(String[] args) {
        ReplaceChar r = new ReplaceChar();
        int len = r.lengthOfLastWord("Hi my name is ... ");
        System.out.println("Length: " + len);

    }
}
// lkh iya
// loop last thi start kryu and kyay pn whitespace aave to break
// nkr count ++;
// ok ael kam kr logic aam aave mara idea thi

// last thi start bt
// pele start and end space remove so string clean thay pachhi pacchd thi aek
// space aavi to aagd ne final mength aapvani

// string is " Hi my name is rni "
// become now "Hi my name is rni"

// d jevi space note kri or aavi to break and rni is final world

// maru hmda aaj logic che
// suppose str is "S" than what???