import java.util.Scanner;

public class IntroInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        //  Largeest number
        System.out.print("Largest Number: ");
        if(num1 > num2) {
            if(num1 > num3) 
                System.out.println(num1);
            else {
                System.out.println(num3);
            }
        } else if(num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        // We also have Math.max Math.min, etc

        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);

        


    }

        
}
