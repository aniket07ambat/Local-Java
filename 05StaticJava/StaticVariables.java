class Mobile {
    String brand;   
    int price;
    // String name;
    // Above all are instance variable.

    static String name; //  with static name is now common for all objects.
    // With static we can make name as class Member not object member.

    public void show() { // This is instance method
        System.out.println(brand + " : " + price + " : " + name);
        // If I create a variabel here Suppose
        // String myName;
        // This is local variable.
    }
    public static void show2() { // This is static method
        // System.out.println(name + brand + price); // This is gives an error as we don't mention which obj brand and price are .
    }
    
    public static void show3(Mobile obj) { // This is static method
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}


public class StaticVariables {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        Mobile.name = "Smartphone";   

        obj1.show();
        obj2.show();

        Mobile.name = "Phone";
        obj1.show();
        obj2.show();

        Mobile.show3(obj1);  

    }
}
