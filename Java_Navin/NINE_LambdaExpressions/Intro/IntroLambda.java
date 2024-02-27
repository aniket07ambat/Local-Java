// Lambda expressions only works with functional interface.
@FunctionalInterface
interface A_intro {
    void show();
}

@FunctionalInterface
interface B_intro {
    void price(int p);
}

public class IntroLambda {
    public static void main(String[] args) {
        A_intro obj1 = new A_intro() {
            public void show() {
                System.out.println("lots of code is there any way to reduce this. -> LAMBDA EXPRESSIONS");
            }
        };

        A_intro obj2 = () -> {
            System.out.println("Thanks Lambda Expressions.");
        };

        // we can also write

        A_intro obj3 = () -> System.out.println("In one line only if we have one method.");

        // Now try this 
        B_intro obj4 = new B_intro() {
            public void price(int p) {
                System.out.println("price is " + p);
            }
        };
        obj4.price(1000);

        // B_intro obj5 = (int p) -> System.out.println("price is " + p);
 
        // if only one variable then 
        B_intro obj5 = p -> System.out.println("price is " + p);

    }
}
