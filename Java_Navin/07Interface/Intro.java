/*
 * When one inheriting from another
 * class -> class :         extends
 * class -> interface :     implements
 * interface -> interface : extends
*/ 


// Whenever we have class which only contains abstract methods we can use interface there for those methods.

// Interface is not class.

// abstract class A_Intro {
//     public abstract void show();
//     public abstract void config();
// }

interface A_Intro_one {
    // methods are by default public abstract
    void show();
    void config();

    // We can also declare variables in interface but they are final and static. 
    // final means we have to initilaze and we can't change them.
    // static means we can acess them without object.

    int age = 12;
    String area = "Pune";
}

interface A_Intro_two {
    void run();
}

interface A_Intro_three extends A_Intro_two {

}

// class can implements multiple interfaces which is not possible in abstract class.

class B_Intro implements A_Intro_one, A_Intro_three {
    // If we fail to implement all abstract methods define in interface this B_Intro became abstract class.

    public void show() {
        System.out.println("IN B show");
    }

    public void config() {
        System.out.println("IN B config");
    }
    public void run() {
        System.out.println("run");
    }
}


public class Intro {
    public static void main(String[] args) {
        A_Intro_one obj1;

        obj1 = new B_Intro();

        obj1.config();
        obj1.show();

        // Accessing variables without using object.

        // A_Intro.age = 33; // This will give an error as we can't change interface variables.
        int myAge = A_Intro_one.age;
        System.out.println(myAge);

        System.out.println(A_Intro_one.area);

        // obj1.run()  
        // Now if we want to call run method ERROr as A_Intro_one has not refrence to run method

        A_Intro_three obj2 = new B_Intro();
        obj2.run();
    }

}
