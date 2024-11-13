class Human {
    // it means that the age variable can only be accessed within the Human class.
    private int age = 10;
    String name;

    // create method that will return the age -- way to access the age variable
    public int getAge() {
        return age;
    }

    // create method that will set the age -- way to modify the age variable
    public void setAge(int age) {
        /*
         * this method will allow you to set the age variable because due to same name
         * of our private variable and the parameter name we use this to reference the
         * age variable of the class -- refer to current object
         */
        this.age = age;
    }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "John";
        // human.age = 30; // this will give an error because age is private

        System.out.println("Name :" + human.name);
        System.out.println("Age :" + human.getAge());

        human.setAge(30);
        System.out.println("New Age :" + human.getAge());

    }
}

// Encapsulation is a mechanism where you restrict access to some of the
// object's components.

// Encapsulation is a technique used to protect the information in an object
// from being modified by the code outside this object.

// Encapsulation characteristics:
// 1. The variables of a class will be hidden from other classes, and can be
// accessed only through the methods of their current class.
// 2. The class methods will be public, and the variables will be private.
// 3. The variables of a class can be accessed and modified only through the
// methods of their current class.
