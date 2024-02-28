
// Maps are used to store key value pairs.


// IN HashMap keys are unique.
// Generally T.C : O(1);

import java.util.HashMap;
import java.util.Map;

public class IntroHashMap {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<String, Integer>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        System.out.println(numbers);

        // We can override values as of Key
        numbers.put("Two", 34);
        System.out.println(numbers);

        numbers.putIfAbsent("Five", 5);
        System.out.println(numbers);

        // How to iterrate over Map
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            // System.out.println(e);
            System.out.println();

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // if we Just want to iterate over Keys
        for (String Key  : numbers.keySet()) {
            System.out.println(Key);
        }

        for (Integer vl : numbers.values()) {
            System.out.println(vl);
        }

        // we can also check if any key is present or not
        System.out.println(numbers.containsKey("Two"));

        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

        // We can also remove 
        numbers.remove("Two");
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}
