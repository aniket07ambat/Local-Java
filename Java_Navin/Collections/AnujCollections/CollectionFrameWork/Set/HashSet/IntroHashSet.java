import java.util.HashSet;
import java.util.Set;

// HashSet has random elements.
// All operations generallly in T.C: O(1)
public class IntroHashSet {
    public static void main(String[] args) {
         
        Set<Integer> set = new HashSet<Integer>();
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
