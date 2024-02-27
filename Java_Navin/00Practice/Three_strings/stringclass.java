
class Methods {


    // public void reverse(String s) {

    //     // This is not efficient algorithm as we are constantly creation new objects during concation
    //     // and discard or garbage collected previous values. This is overhead.
    //     if(s == null) 
    //         return ;

    //     if(s.length() == 0)
    //         System.out.println("print something.");

    //     String s2 = "";

    //     for (int i = s.length() - 1; i >= 0; i--) {
    //         s2 += s.charAt(i);
    //     }
    //     System.out.println(s2);

    // }

    public void reverse(String s) {
        if(s == null) 
            return ;

        if(s.length() == 0)
            System.out.println("print something.");

        StringBuilder name = new StringBuilder();
        for(int index = s.length() -1 ; index >= 0; index--) {
            name.append(s.charAt(index));
        }
        String s2 = name.toString();
        System.out.println(s2);
    }

}

public class stringclass {
    public static void main(String[] args) {
        
        Methods obj1 = new Methods();
        String name = "Aniket";
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));

        obj1.reverse(name);
    }
}
