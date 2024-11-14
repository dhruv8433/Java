abstract class Car {

    /*
     * Abstract method -- Suppose i know how to play music but i don't know how to
     * drive a car so we just diclare the functionality of drive and do it's inside
     * work afterwards...
     */

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing music");
    }
}

/*
 * suppose we purchase BMW car and now we learn how to drive and create now we
 * are able to define body of that drive function here
 * 
 * and if we extend the abstract class then we must have to define the abstract
 * method body here
 */
class BMW extends Car {                   // concrete class
    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        // we don't create object of abstract class
        // Car car = new Car(); // this will give error
        Car car = new BMW();
        car.drive();
        car.playMusic();
    }
}

// Abstract method --
// 1. Abstract method is a method that is declared without an implementation
// (without braces, and followed by a semicolon), like this:
// public abstract void drive();
// 2. Abstract method can only be used in an abstract class.
// 3. Abstract class can have both abstract and non-abstract methods.
// 4. If a class has an abstract method, then the class must be declared as
// abstract.
// 5. Abstract class can't be instantiated.
// 6. Abstract class can have constructors.
// 7. If a class is extending an abstract class then it must implement all the
// abstract methods of the abstract class.
// 8. If a class doesn't implement all the abstract methods of the abstract
// class then the class must be declared as abstract.
// 9. Abstract class can have final methods.
// 10. Abstract class can have static methods.
// 11. Abstract class can have main() method and we can run the abstract class.
// 12. Abstract class can have data members.