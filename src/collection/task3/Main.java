package collection.task3;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());


    }
}
