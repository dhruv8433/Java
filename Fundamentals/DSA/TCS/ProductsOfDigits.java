public class ProductsOfDigits {
    public static void main(String[] args) {
        int number = 5244;

        int temp = number;
        int product = 1;

        while (temp != 0){
            // Get the last digit from the number
            int last_dig = temp % 10;

            // Multiply the last digit with the product
            product *= last_dig;

            // Remove the last digit from the number
            temp = temp / 10;
        }

        System.out.println("Product of digits: " + product);
    }
}
