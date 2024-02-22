// Bydefault Strings are immutabel : can't change.

public class Intro {
    public static void main(String[] args) {
        // String in non- Primitive means it is an OBJECT.
        String name = new String("Aniket");
        System.out.println("Hello, " + name);

        // String Methods
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Ambat"));
        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2);
        // Both s1 and s2 are refrence variables which contain heap address of Object Navin which is Stored in "String Constant Pool"

        name = name + " Samarth";
        System.out.println(name);
        // Here new Aniket Samarth Object is created in String Constant Pool. name is refrened variable which contains address.
        // "Aniket" is get removed from memory by garbage collection. 
    }
}
