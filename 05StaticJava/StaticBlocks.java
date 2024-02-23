class Mobile1 {
    String brand;
    int price;
    static String name;

    public Mobile1() {
        brand = "";
        price = 200;
        System.out.println("Inside the constructor");
    }

    static {
        name = "Smartphone";
        System.out.println("Inside the static block");
    }

}
public class StaticBlocks {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile1 obj1 = new Mobile1();  // Object creation

        // Notice here we create an object .
        // Try to run it . First static block is printed then constructor. Why?

        // Whenever there is Object creation for the first Object, first class is loaded then object is created.

        // Every time we load a class, static block is called.
        // Since class loading happened first, so static block is first printed then object created which calls constructor 

        // Class is loded only one time. 
        Mobile1 obj2 = new Mobile1();
        // CLASS LOADER : is area in JVM where all classes are loaded.


        // Now,  don't create any object Then there is no class loaded.
        
        // Class.forName("Mobile1");  // Loads the class without insitiated obj.

    }
}
