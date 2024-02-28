// class A extents to Object class. Every class extends to Object class one way or another[inheritence]

class A { 

    public A() {
        super(); // super is always present Even if you don't mention it.
        System.out.println("in  default constructor A");
    }
 
    public A(int age) {
        super();
        System.out.println("in paraparameterized constructor A");
    }

}

class B extends A{   // class B is subclass.
 
    public B() {
        // super();  // super is always present Even if you don't mention it.
        // We can insert value in super to get class A paraparameterized constructor
        super();
        System.out.println("in default constructor B");
    }

    public B(int a) {
        // this();  // this()  : Will execute the constructor of same class.
        super(5);
        System.out.println("in paraparameterized constructor B");
        
    } 
}

public class SuperAndThis {
    public static void main(String[] args) {
        // B obj = new B();

        B obj2 = new B(6);

    }
}
// this()  : Will execute the constructor of same class.
// super() : Will execute the constructor of parent  class
// super() is always present even if you can't see it.

// Both super and this we are calling them from constructor . 