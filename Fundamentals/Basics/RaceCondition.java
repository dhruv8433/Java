
class Counter {
    int count;

    // public void increment() { 
    // if we use synchronized it means only access one thread at a time
    public synchronized void increment() {
        count++;
    }

}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable a = () -> { // lemda expression
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable b = () -> { // lemda expression
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(a); // pass runnable object to Thread class
        t1.start();

        Thread t2 = new Thread(b);
        t2.start();

        t1.join(); // spacial method that waits until all t1 threds finished
        t2.join();

        System.out.println("Count: " + c.count);
    }
}

// Output:
// in every thread there is only one method called run.

// Race condition means 2 or more threads are trying to access the same resource
// at the same time.
// our output sometimes get 2000 and sometimes random like 1870 1867 because of
// suppose 2 threds are trying to access the same resource and increment at same
// time that's why one thread increment 1 and other thread increment 1 but in
// output we get only 1 increment.


// if we use synchronization it means only one thread can access the resource at a time. and tha's why we always get 2000 times count in output.