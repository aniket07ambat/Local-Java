import java.util.LinkedHashSet;
import java.util.Set;

// If we use TreeSet it sorterd our elements like binary Search Tree. T.C : O(log n )

// LinkedHashSet if print gives elements as how we add in set . Not in random order.

public class IntroLinkedHashSet  {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(598);
        set.add(50);
        set.add(56);
        set.add(40);
        set.add(50);

        System.out.println(set);

        System.out.println(set.contains(50));
        System.out.println(set.contains(1));

        set.remove(50);
        System.out.println(set);

        boolean result = set.isEmpty();
        System.out.println(result);

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}