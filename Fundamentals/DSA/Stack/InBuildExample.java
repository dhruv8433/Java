import java.util.Stack;

public class InBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
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
    }
}
