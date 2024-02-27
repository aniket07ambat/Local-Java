
public class Intro {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        // try {
        //     j = 18 / i;       
        // } catch (Exception e) { // Try throws an object if error occors.
        //     System.out.println("Error");
        // }

        // System.out.println(j);
        // System.out.println("Bye is still printing even if there is an error with try catch block.");


        // Lets try with multiple catch 

        int[] nums = new int[5];
        String str = new String();
        str = null;
        
        try {
            j = 12/5;

            System.out.println("nums at 0 index" + nums[0]);
            // System.out.println(nums[5]);
            System.out.println(str.length());
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic error" + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error" + e);
        } catch(Exception e) { // always put Exception class at end because it is parent class.
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");

    }

}
