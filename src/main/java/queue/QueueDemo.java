package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("First Element");
        queue.offer("Second Element");
        queue.offer("Third Element");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
