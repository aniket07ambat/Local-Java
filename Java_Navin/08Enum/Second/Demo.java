
enum Laptop {
    MacBook(2000), HP(1000), Lenovo(1200), Dell;

    private int price;
    private int count = 0;
    // Here objcect creation means constructor is called

    private Laptop() {
        price = 500;
        System.out.println("Constructor calls " + count++ );
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("Constructor calls " + count++ );
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


public class Demo {
    public static void main(String[] args) {
        
        // Laptop lap = Laptop.MacBook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
        System.out.println(lap + " : " + lap.getPrice());
            
        }
    }
}
