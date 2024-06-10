package leetcode;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person("Aydin");
        Person p1 = new Person("Gunel");
        Person p2 = new Person("Musa");
        Person p3 = new Person("Aydan");
        Person p4 = new Person("Xanim");
        Person p5 = new Person("Zayneb");


        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(p);
        priorityQueue.offer(p1);
        priorityQueue.offer(p2);
        priorityQueue.offer(p3);
        priorityQueue.offer(p4);
        priorityQueue.offer(p5);


        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }


    }


}
