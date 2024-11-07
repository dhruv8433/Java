class Student {
    int id;
    String name;
}

public class Array {
    public static void main(String[] args) {
        // Declare an array of integers
        int nums[] = { 1, 2, 3, 4, 5 };

        // Declare a empty array of integers
        int nums2[] = new int[5];

        // Print the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // print the empty array
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }

        // Multi-dimensional array
        int nums3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // or int nums4[][] = new int[3][3];

        // Print the multi-dimensional array #matrix representation
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                System.out.print(nums3[i][j] + " ");
            }
            System.out.println();
        }

        // Assign random numbers to the empty array
        int arr4[][] = new int[3][4];

        // assign random numbers to the multi-dimensional array
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                // type casting to int to ensure that the random number is an integer
                arr4[i][j] = (int) (Math.random() * 100);
            }
        }

        // Print the multi-dimensional array #matrix representation
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced for loop");

        // or we can use enhanced for loop
        for (int[] row : arr4) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Jagged array -- an array of arrays of different sizes whose inside arrays are
        // of different sizes

        int jaggedArray[][] = new int[3][];

        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[5];

        System.out.println("Displaying jagged array -- different sizes of inner arrays: 3, 4, 5");

        // print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 100);
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // and in enhanced for loop we don't need to specify the size of inner array
        System.out.println("Enhanced for loop for jagged array");

        for (int[] row : jaggedArray) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Array of objects
        Student students[] = new Student[2];
        // Or
        Student stud = new Student();
        // stud.id = 1; like this we can assign values to the object

        students[0] = new Student();
        students[0].id = 1;
        students[0].name = "John";

        students[1] = new Student();
        students[1].id = 2;
        students[1].name = "Jane";

        // Print the array of objects
        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].id + " " + students[i].name);
        // }

        // enhanced for loop also called #foreach loop 
        for (Student student : students) {
            System.out.println(student.id + " " + student.name);
        }
    }
}
