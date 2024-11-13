// Object Oriented Programming
// Objects - Properties and behaviors

// custom class 
class Calculator {
    public int Addition(int x, int y) {
        return x + y;
    }
}

public class Objects {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        Calculator calc = new Calculator();
        int result = calc.Addition(a, b);
        System.out.println( result);
    }
}

