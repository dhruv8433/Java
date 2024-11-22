@Deprecated   // annotation - means deprecated and may be removed in future
class A14{
    void show(){
        System.out.println("In A");
    }
}

class B14 extends A14{
    @Override                         // annotation
    void show(){
        System.out.println("In B");
    }
}

public class Annonatations {

    public static void main(String[] args) {
        B14 obj = new B14();
        obj.show();
    }
}
