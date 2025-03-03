package Strings;

public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs[i].length(); j++){
                if(strs[i].charAt(i) == strs[j].charAt(j)){
                    prefix += strs[i].charAt(i);
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        Problem14 p = new Problem14();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(p.longestCommonPrefix(strs)); 
    }
}
