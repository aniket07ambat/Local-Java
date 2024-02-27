// final keyword is const in Javascript, c , c++.

// if we use final keyword on class we can't inherit this class.
final class  Final_A {
    public void show() {
        System.out.println("No one is going to inherit me.");
    }
}

class Final_B {
    public final void show() {
        System.out.println("With final keyword using in show method no one is going to steal my credit.");
    }
    public int add(int a, int b) {
        return a + b;
    }
}

class Final_C extends Final_B {
    // public void show() {
    //     System.out.println("Why he use final keyword Now I can't steal its work.");
    // }
}
public class FinalKeyword {
    public static void main(String[] args) {
        
        // final variable
        final int a = 4;  // Here we make a as const variable.
        // a = 5; // This gives error.
        Final_C obj = new Final_C();
        obj.add(2, 4);
        

    }
}
