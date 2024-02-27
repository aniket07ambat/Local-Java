
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intro {
    public static void main(String[] args) {
        // Collection nums = new ArrayList();
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(9);

        // System.out.println(nums);
        // for (int i : nums) {
        //     System.out.println(i);
        // }

        // What is happing above is all these 5 , 6, 7 values we added are automaticllay converts into objects .
        // Collection works with Classes not primitive data types. SO to solve above problem
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);

        for (int i : nums) {
            // System.out.println(i);
        }
        
        // If we want to get index we need to work with list.
        
        List<Integer> nums2 = new ArrayList<Integer>(); 
        nums2.add(5);
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);

        System.out.println(nums2.indexOf(6));

        System.out.println(nums2.get(3));

        // Set can't have repitative values
        // Set gives values in random order.
        // Does not have method like getIndex()

        // Set is collection of unique values.
        Set<Integer> nums3 = new HashSet();
        nums3.add(45);
        nums3.add(90);
        nums3.add(67);
        nums3.add(45);
        nums3.add(85);

        for (int n : nums3) {
            System.out.println(n);
        }
        

        
        
    }
}
