// package AbstractKeyword;

// abstract class Car {
    
//     public abstract void drive();

//     public void playMusic() {
//         System.out.println("play music.");
//     }
       
// }

// class TATA extends Car{
//     public void drive() {
//         System.out.println("Driving in TATA");
//     }
//     public void music() {
//         System.out.println("Tata music");
//     }
// }

// public class DemoAbstract {
//     // Car obj = new Car();
//     // You can't create object of abstract class
    
//     // TATA obj1 = new TATA();
//     // obj1. we can't use obj1  // error

//     Car obj2 = new TATA();
//     obj
    

// }


package AbstractKeyword;

// Define abstract class Car
abstract class Car {
    // Abstract method to be implemented by subclasses
    public abstract void drive();

    // Non-abstract method with implementation
    public void playMusic() {
        System.out.println("play music.");
    }
}

// Subclass TATA extending Car
class TATA extends Car {
    // Implementing the abstract method drive() from the superclass
    public void drive() {
        System.out.println("Driving in TATA");
    }

    // Additional method specific to TATA class
    public void music() {
        System.out.println("Tata music");
    }
}

public class DemoAbstract {
    public static void main(String[] args) {
        // Creating objects and demonstrating usage

        // You can't create an object of an abstract class directly
        // Car obj = new Car(); // This line is commented out

        // We can't directly use obj1 because it's of type TATA
        // TATA obj1 = new TATA(); // This line is commented out

        // We can create an object of type Car and instantiate it as a TATA
        Car obj2 = new TATA();
        // Calling the drive method which is overridden in TATA
        obj2.drive();
        // We can call the playMusic method which is inherited from Car
        obj2.playMusic();
    }
}

