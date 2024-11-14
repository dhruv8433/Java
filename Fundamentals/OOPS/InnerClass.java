class A12{
    int age;

    public void show(){
        System.out.println("Hello");
    }

    class B12{
        void show(){
            System.out.println("Inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A12 obj = new A12();

        obj.show();
        // now we call inner class methods
        A12.B12 obj1 = obj.new B12();
        obj1.show();
    }
}
