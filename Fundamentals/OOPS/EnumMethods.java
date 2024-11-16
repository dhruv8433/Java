enum MyLaptop {
    DELL(2000), HP(8000), LENOVO, ASUS(10000), ACER(4300);

    private int price;

    private MyLaptop() {
        price = 500;    // default value to price for LENOVO
    }


    private MyLaptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumMethods {
    public static void main(String[] args) {
        MyLaptop lap = MyLaptop.ACER;
        System.out.println(lap + " : " +lap.getPrice());

        for (MyLaptop laptop: MyLaptop.values()){
            System.out.println(laptop + " : " + laptop.getPrice()); // print all laptops
        }
    }
}