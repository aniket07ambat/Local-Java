// package Java_Kunal.Functions;

import java.util.Scanner;

class NewFunctions {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void dispalyGreeting() {
        System.out.println("Aniket Greets you Happy process for your learning.");
    }

    public void swap(int num1, int num2) {
        

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        int temp = num1;
        num1 = num2; 
        num2 = temp;
        
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


    }
}

public class IntroFunctions {
    public static void main(String[] args) {
        NewFunctions obj1 = new NewFunctions();
        
        // Q.  Take input of 2 numbers and sum it.
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        // obj1.add(num1, num2);
        
        // obj1.dispalyGreeting();

        // System.out.println("num1: " + num1);
        // System.out.println("num2: " + num2);

        obj1.swap(num1, num2);
        
        System.out.println("num1 in main: " + num1);
        System.out.println("num2 in main: " + num2);

        
    }
}
