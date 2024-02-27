// throw is used to throw an exception an catch block will catch it.
public class HandleException {
    public static void main(String[] args) {

        // We are going to handle exceptions.

        int i = 0;
        int j = 0;

        try {
            j = 12/i;
            // We can also call catch block
            if(j == 0) 
                throw new ArithmeticException("I am printing some message");

        } catch(ArithmeticException e) {
            // Handle exception
            System.out.println("Default value of j " + e);
            j = 12;

            // Here we usually try to solve the error i.e if not connectioning to primary database then connect to backup database.
        }
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }

}
