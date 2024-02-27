/*
 * if we call                  then
 *      AdvaceCalculator       Calculator
 *          child class         parent class
 *          subclass            super class
 *          deverived class     base class
 */

// THis is relationship of  "is" keyword.

public class AdvaceCalculator extends Calculator {
    
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
