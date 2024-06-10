package collection.priorityqueue;

import javax.xml.parsers.SAXParser;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task {
    public static void main(String[] args) {
//1ci tapsiriq
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("White");
        queue.offer("Black");
        queue.offer("Orange");
        queue.offer("Yellow");
        queue.offer("Purple");
        queue.offer("Gray");
        queue.offer("Green");


//2-ci tapsiriq
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------------------------------");


        //3cu tapsiriq
        PriorityQueue<String> newQueue = new PriorityQueue<>();

        while (!queue.isEmpty()) {
            newQueue.offer(queue.poll());
        }

        while (!newQueue.isEmpty()) {
            System.out.println(newQueue.poll());
        }


        //4cu tapsiriq

        Queue<String> queue1 = new PriorityQueue<>();
        String element = "yello";
        String element1 = "white";
        String element2 = "purple";
        queue1.offer(element);
        queue1.offer(element1);
        queue1.offer(element2);


        //5ci tapsiriq

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        //6ci tapsiriq
        int count = 0;
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.offer(25);
        queue2.offer(30);
        queue2.offer(1);
        queue2.offer(42);
        queue2.offer(21);
        queue2.offer(18);

        while (!queue2.isEmpty()) {
            queue2.poll();
            count++;
        }
        System.out.println("queuede " + count + "  element var");


        //7ci tapsiriq

        PriorityQueue<Integer> queue3 = new PriorityQueue<>();
        queue2.offer(521);
        queue2.offer(12);
        queue2.offer(25);
        queue2.offer(27);
        queue2.offer(95);
        queue2.offer(14);
        queue2.offer(2);

        System.out.println("queue2-nin ilk elementi " + queue2.peek());


        //8ci tapsiriq

        System.out.println("queue2-nin ilk elementini gosterir ve silir " + queue2.poll());

    }
}
