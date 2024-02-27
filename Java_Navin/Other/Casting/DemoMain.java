package Casting;

class A {
    public void show1() {
        System.out.println("In class A.");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In class B.");
    }
}
public class DemoMain {
    public static void main(String[] args) {
        // TypeCasting 
        double num1 = 5.5;
        int num2 = (int) num1;
        System.out.println(num1 + " typeCast into " + num2 );
        
        // UpCasting
        A obj1 = new B();
        obj1.show1(); 

        A obj2 = (A) new B(); //  Here we don't have acess to show2() as Our Object B is refrence to A.
        obj2.show1();

        // DownCasting
        B obj3 = new B();
        obj3.show1();
        obj3.show2();

        B obj4 = (B) new B();
        obj4.show1();
        obj4.show2();

        // We can also do this Downcast obj1 so that we have acess to show2
        B obj5 = (B) obj1;
        obj5.show1();
        obj5.show2();
        
    }
}
