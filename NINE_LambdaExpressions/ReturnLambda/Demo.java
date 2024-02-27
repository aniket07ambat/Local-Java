
@FunctionalInterface
interface A_Demo {
    int add(int a, int b);
}

public class Demo {
    public static void main(String[] args) {
        
        A_Demo obj1 = new A_Demo() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        int result1 = obj1.add(4, 3);
        System.out.println(result1);

        // Lambda 

        // A_Demo obj2  = (int a, int b) -> {
        //     return a + b;
        // };
        // If we have only one sentance.
        // A_Demo obj2 = (int a, int b) ->  a + b;
        A_Demo obj2 = ( a,  b) ->  a + b;

    }
}
