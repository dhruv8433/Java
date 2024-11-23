// class Thread1 implements Runnable { // for Thread it's parent class is Runnable and it also works
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10); // sleep for 10 miliseconds after one thread
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hllo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ThredsJava {
    public static void main(String[] args) {
        // Runnable a = new Thread1();  // instead of Thread we create runnable object

        // or
        Runnable a = () -> {    // lemda expression
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10); // sleep for 10 miliseconds after one thread
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        // a.show();
        // a.start();  // it will not work because we have to use Thread class to start the thread

        Thread t1 = new Thread(a); // pass runnable object to Thread class
        t1.start();

        Thread2 b = new Thread2();
        // b.show();
        b.start();

        b.setPriority(Thread.MAX_PRIORITY); // set priority to 10 #highest
    }
}

// Output:
// in every thread there is only one method called run.