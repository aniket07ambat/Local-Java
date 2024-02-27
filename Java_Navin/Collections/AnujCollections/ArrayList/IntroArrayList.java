
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class IntroArrayList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // // Why use ArrayList?
        // String[] studentsName = new String[30];
        // studentsName[0] = "Aniket";
        // studentsName[1] = "Sam";
        // // //
        // // // 
        // studentsName[29] = "Parth";

        // if new students come then we can't increase array size. SO,

        ArrayList<String> studentsName = new ArrayList<String>();
        // Inner Working it increases size by 
        // size = n to n + n/2 + 1

        studentsName.add("Aniket");

        // We can also use List

        List<Integer> list = new ArrayList<Integer>();

        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.add(7);  // add at end of list.
        System.out.println(list);

        // If we want to add in between
        list.add(2, 80);
        System.out.println(list);

        // if we want to add two list 
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(57);
        list2.add(67);  // T.C: O(n)

        // list.addAll(list2);
        // if we want to add in between
        list.addAll(1, list2);
        System.out.println(list);  // T.C: O(n)

        // TO get an element
        System.out.println(list.get(3));


        // With remove as all elements are shifting positions 
        // Time C: O(n)
        // To remove element with index.
        System.out.println(list.remove(4));
        System.out.println(list);

        // To remove element with element
        System.out.println(list.remove(Integer.valueOf(57)));
        System.out.println(list);
        
        // Above remove or add methods are example of method overloading.

        // To  remove all the elements from the list
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        // If we want to set or replace an element // T.C: O(1)
        System.out.println(list);
        list.set(2, 555);
        System.out.println(list);

        // If we want find element is present or not 
        // T.C: O(n)
        System.out.println(list.contains(67)); // True
        System.out.println(list.contains(89)); // false

        // How to iterate over an array

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (Integer element : list) {
            System.out.print(element * 2 + " ");
        }
        System.out.println();

        // Iterator 

        java.util.Iterator<Integer> it = list.iterator();

        System.out.println(it.next());  // 4

        while (it.hasNext()) {
            System.out.print(it.next() + " ");  // 67 555 6 7
        }
        System.out.println();
















    }
    
}