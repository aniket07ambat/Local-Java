// If only one method in interface then  Single Abstract Method Interface i.e functional Interface.

@FunctionalInterface
interface AFunctional {
    void show();
}

// @FunctionalInterface
// interface BFunctional {  // This wiil give error as we use annotation @FunctionalInterface
//     void show1();
//     void run1();
// }

class A implements AFunctional {
    public void show() {
        System.out.println("In class A");
    }
}

public class functionalInterface {
    public static void main(String[] args) {
        AFunctional obj1 = new AFunctional(){
            public void show() {
                System.out.println("Anonymous object");
            }
        };


        AFunctional obj2 = new A();
        obj2.show();
    }
}
