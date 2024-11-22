import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = null;
        try {
            System.out.println("Enter No: ");
            // int no = System.in.read(); // provide AnCII value
            // System.out.println("User Input: " + no );

            // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // or
            InputStreamReader reader = new InputStreamReader(System.in);

            int num = Integer.parseInt(buffer.readLine()); // readLine() method is used to read a line of text from the
            buffer = new BufferedReader(reader); // console and it is bydefault give string so we have to parse it
            // into integers

            System.out.println("User Input: " + num);

            // or
            Scanner sc = new Scanner(System.in);
            sc.next(); // read string
            sc.nextInt(); // read integer
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            buffer.close(); // always write closing statement inside finally
        }

        // or 
        // we can directly do that thing in try block
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter No: ");
        }
        // it will autometically close the buffer after completion of the try block
    }
}
