package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Person 1");
        queue.offer("Person 2");
        queue.offer("Person 3");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
