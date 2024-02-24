

public class Inheritance {
    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        int result1 = obj.add(4, 3);
        int result2 = obj.sub(4, 3);
        System.out.println("add: " + result1 + " sub:" + result2);
        
        AdvaceCalculator obj2 = new AdvaceCalculator();
        int result3 = obj2.add(4, 3);
        int result4 = obj2.multiply(4, 3);
        System.out.println("add: " + result3 + " multiply: " + result4);

        // Here Multi level inheritance  
        // Note: multi level inheritance is different from multiple inheritance.
        // Java doesn't support multiple inheritance.
        ScientificCalculator obj3 = new ScientificCalculator();
        int result5 = obj3.add(4, 3);
        int result6 = obj3.multiply(4, 3);
        int result7 = obj3.power(4, 3);

        System.out.println("add: " + result5 + " multiply: " + result6 + " power: " + result7);
    }
}
