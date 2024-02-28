class A {
    public void show() {
        System.out.println("In class A show");
    }

    public void config() {
        System.out.println("In class A config");
    }
}

class B extends A {
    public void show() { // Here show() method has prefrence.
        System.out.println("In class B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.config();
    }
}


