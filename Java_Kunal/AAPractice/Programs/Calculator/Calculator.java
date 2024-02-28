// package Java_Kunal.AAPractice.Programs.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int result = 0;
            
            // Take operation
            char op = in.next().trim().charAt(0);

            if(op == 'X' || op == 'x') {
                System.out.println("Thank you, User");
                System.out.println("Credit: Aniket Ambat");
                break;
            }

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                // if(op == '+') {
                //     result = num1 + num2;
                // }
                // if(op == '-') {
                //     result num1 - num2;
                // }

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    
                    case '-': 
                        result = num1 - num2;
                        break;

                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                        result = num1 / num2;
                        break;
                    
                    case '%':
                        result = num1 % num2;
                        break;

                    default:
                        break;
                }
                System.out.println(result);
            
            }   
            else  {
                System.out.println("Give valid input");
                break;
            }
            
        }
    }
}
