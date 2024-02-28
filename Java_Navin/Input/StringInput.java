import java.util.Scanner;



public class StringInput {
    public static void main(String[] args) {
        
        // Lets input for first char first 
        // There is no nextchar here.

        Scanner in = new Scanner(System.in);
        // char ch = in.next().trim().charAt(0);

        // // Now find Alphabet capital or not
        // if('A' <= ch && ch  <= 'Z') {
        //     System.out.println("Yes it is capital");
        // } else {
        //     System.out.println("Not capital");
        // }

        // Fibonacci numbers : 0, 1, 1, 2, 3, 5, 8, 13, 21

        int a = 0;
        int b = 1;
        int n = in.nextInt();
        for (int i = 2; i < n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(b);

    }
}
