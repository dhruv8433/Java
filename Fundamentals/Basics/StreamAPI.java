import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList();
        // nums.add(1);
        // nums.add(18);

        // or
        List<Integer> nums = Arrays.asList(1, 18, 2, 3, 3);

        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) { // if number is even, then
                n *= 2; // double n
                sum += n; // adding all even numbers add to sum
            }
        }

        System.out.println("values" + nums);
        System.out.println("even no * 2 and add all even in sum : " + sum); // 18 * 2 = 36 + 2 * 2 = 4 = 40

        // for print we can also use forEach loop
        nums.forEach(n -> System.out.println(n));

        // for each is part of consumer
        // Consumer<Integer> consumer = n -> System.out.println(n);
        // System.out.println("using consumer");
        // nums.forEach(consumer); // it also prints loop of nums

        // Stream API -- kind of three address code
        // use refrence of prev stream to perform operation
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // filter out even numbers
        Stream<Integer> s3 = s2.map(n -> n * 2); // multiply even no by 2\

        // or

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e); // store even no
                                             // * 2 and
                                             // calculate
                                             // result by
                                             // adding them
        System.out.println("resule of even * 2 and add into result :" + result);

        // s2.forEach(n -> System.out.println("Even" + n));
        s3.forEach(n -> System.out.println("Even * 2 : " + n));

        Stream<Integer> sortedValue = nums.stream().sorted();
        sortedValue.forEach(n -> System.out.println("Sorted Value : " + n));
    }
}

// Stream API is introduced in Java 8. It is used to process collections of
// objects. A stream is a sequence of objects that supports various methods
// which can be pipelined to produce the desired result.
// The features of Java stream are –
// A stream is not a data structure instead it takes input from the Collections,
// Arrays or I/O channels.
// Streams don’t change the original data structure, they only provide the
// result as per the pipelined methods.
// Each intermediate operation is lazily executed and returns a stream as a
// result, hence various intermediate operations can be pipelined.
// Stream is used to compute the result and it does not modify the original
// data.

// we use stream only once. If we want to use it again, we have to create a new
// stream.