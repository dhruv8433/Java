public class RemoveSpace {
    public static void main(String[] args) {
        String str = "  Hello       World  !";
        String newStr = str.replaceAll("\\s", "");
        System.out.println("String after removing space: " + newStr);

        // or
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') continue;
            System.out.print(str.charAt(i));
        }
    }
}
