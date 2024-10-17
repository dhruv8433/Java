class Basic {
    // constant

    static final double PI = 3.14;

    public static void main(String[] args) {
        // simple print
        System.out.println("Hello World");

        // variable's #scope gloable

        int temp = 10;
        float percentage = 1.0f;

        float total = (temp + percentage);

        System.out.println("total test : " + total);
        System.out.println("PI : " + PI);
    }
}