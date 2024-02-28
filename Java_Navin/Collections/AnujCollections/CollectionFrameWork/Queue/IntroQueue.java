import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());

        



    }

}
