// package Polymorphism;

class A {
    public void show() {
        System.out.println("In class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In class B");
    }
}

class C extends B {
    public void show() {
        System.out.println("In class C");
    }
}

class D {
    public void show() {
        System.out.println("In class D");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // new A(); // means object creation.

        A obj = new A(); // Here first A is refrenced to obj A.
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // Above code is work of polymorphism.
        // But if you do 
        // obj = new D(); // This gives an erroe as class D is not inheriting class A.
    }
}
