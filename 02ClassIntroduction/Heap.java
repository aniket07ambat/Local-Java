class Calculator {

    int num = 10; // here num is instance variable.

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }
}


public class Heap {
    public static void main(String[] args) {
        int data = 10;

        Calculator obj = new Calculator(); // here obj is not object it is refrence variable.
        // When you call new Calculator new Object is created in Heap memory.
        
        int result = obj.add(3, 4);
        System.out.println(result);

        Calculator obj1 = new Calculator();

        obj.num = 100;

        System.out.println("obj: num value is " + obj.num);
        System.out.println("obj1: num value is " + obj1.num);  // value remains same .

        // There are Two objects in heap memory obj and obj1.

    }
}
