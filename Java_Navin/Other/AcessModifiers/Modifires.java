/*
 * Try to make your classes public
 * In one file you should only have one class
 * Try to keep your instance variables private.
 * methods are public
 * 
 * Protected: If there is method which we want to only acess in subclass of other packages use protected.
 */

package AcessModifiers;
import AcessModifiers.Inside.InsideClassB;

public class Modifires {
    public static void main(String[] args) {
        FirstClassA obj1 = new FirstClassA();
        int result1 = obj1.marks = 4;

        InsideClassB obj2 = new InsideClassB();
        obj2.getAge();

        System.out.println(result1);
    }
}
