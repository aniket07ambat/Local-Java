package Packages;


import java.util.ArrayList;

import Packages.tools.AdvanceCalc;


public class Demo {
    public static void main(String[] args) {
        AdvanceCalc obj = new AdvanceCalc();
        int result1 = obj.multiply(3, 5);
        int result2 = obj.add(3, 5);
        System.out.println("multiply:" + result1);
        System.out.println("add:" + result2);
        
        // ArrayList list = new ArrayList<>();
    }
}