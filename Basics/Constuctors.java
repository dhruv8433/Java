class Person {
    private String name;
    private int age;

    // default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // parameterized constructor take name and age as parameters
    public Person(String name, int age) {
        super(); // this will call the default constructor and return a new instance #superclass of that constructor
        this.name = name;
        this.age = age;
    }
   
    // parameterized constructor take name and age as parameters
    public Person(String name, double age) {
        this(); // this method is called to call the default constructor means the above constructor is called this also called
        this.name = name;
        this.age = (int)age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Constuctors {
    public static void main(String[] args) {
        System.out.println("hi");

        Person p1 = new Person("new", 30);
        // default values by constructor
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // and if we just call object 
        new Person(); // this is called anonymous object
        // but you can't use this object again every time you have to do 
        new Person().getName();  
    }
}

// Constructor is a special type of method that is used to initialize the object.
// Java constructor is invoked at the time of object creation. It constructs the values i.e. provides data for the object that is why it is known as the constructor.

// Rules for creating Java constructor
// There are two rules defined for the constructor.
// Constructor name must be the same as its class name
// A Constructor must have no explicit return type

// Characteristics of Java constructor
// 1. Java constructor is invoked at the time of object creation.
// 2. It constructs the values i.e. provides data for the object.
// 3. It is a special type of method which is used to initialize the object.
// 4. Every time an object is created using the new() keyword, at least one constructor is called.
// 5. A default constructor is called when you create an object.
// 6. Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.
// 7. Java constructor can't be abstract, static, final, and synchronized.
// 8. It can be overloaded.
// 9. Constructors can have access specifiers.
// 10. Constructors cannot be inherited.