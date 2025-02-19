public class CustomStackImple{
    public static void main(String[] args)  throws Exception {
        CustomStack stack = new CustomStack(5);

        stack.push(15);
        stack.push(22);
        stack.push(38);
        stack.push(45);
        stack.push(59);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }   
}
