import java.util.Stack;

public class IntroStack {
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<String>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Monkey");
        animals.push("Zebra");

        System.out.println("Stack: " + animals);

        // TO See the top element of stack
        System.out.println(animals.peek());

        // TO remove top element
        animals.pop();
        System.out.println("Stack: " + animals);

        // to see Stack empty or not
        System.out.println(animals.empty());





    }
}
