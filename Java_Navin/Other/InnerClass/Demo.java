package InnerClass;


class A {
    int age;
    
    public void show() {
        System.out.println("In class A");
    }

    class Inner_of_A {
        public void config() {
            System.out.println("In Inner_of_A class ");
        }
    }

    static class  Inner_of_A2 {
        public void showing() {
            System.out.println("In Inner_of_A2 class ");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        // obj1.show();
        
        // // if I want to acess Inner_of_A class 
        // A.Inner_of_A obj2 = obj1.new Inner_of_A();  // Here obj1 is needed 
        // obj2.config();

        // // We can make inner class Static so that they are easily available.
        // A.Inner_of_A2 obj3 = new Inner_of_A2();
        // obj3.showing();


        // Anonymous Inner Class
        A obj6 = new A(){
            public void show() {
                System.out.println(" Anonymous inner class");
            }
        };  // Here object of A is created with new design i.e given design.
        // if we write below code it gives design of class A
        // A obj7 = new A();

        obj6.show();
    }
}
