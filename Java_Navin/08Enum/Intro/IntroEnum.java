// Used for Named Constants.
// enum is not Inheritable.
// enum class extends to class java.lang.Enum
enum Status {
    // Named constants They have assinend numbers from 0 to n left to right.
    Running, Failed, Pending, Success;
    // Running -> 0
    // Failed  -> 1 
}

// class MyClass extends MyEnum { // This will result in a compilation error
//     // Class body
// }

public class IntroEnum {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s);

        // Printing out their numbers.
        System.out.println(s.ordinal());

        // If we want to print all statuses.
        Status[] arr = Status.values();
        for (Status i : arr) {
            System.out.println(i + " : " + i.ordinal());
        }

        // Switch case for enums
        switch (s) {
            case Running:
                System.out.println("All Good.");
                break;
                    
            case Failed:
                System.out.println("Try again.");
                break;
                    
            case Pending:
                System.out.println("Please wait.");
                break;
                    
            default:
                System.out.println("Done");
                break;
        }

        // enum class extends to class java.lang.Enum
        System.out.println(s.getClass().getSuperclass());
    }
}
