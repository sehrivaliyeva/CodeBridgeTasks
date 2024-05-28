package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Task1 {

    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.countStudent(task.studentArray, task.sandwichArray));

    }

    int studentArray[] = {0, 1, 0, 1, 1, 0, 1};
    int sandwichArray[] = {0, 1, 1, 1, 0, 0, 1};


    public int countStudent(int students[], int[] sandwich) {
        Deque<Integer> dequeStudent = new ArrayDeque<>();
        Stack<Integer> stackSandwich = new Stack<>();
        int ableStudentCount = 0;
        int unableStudentCount = 0;

        for (int i = 0; i < students.length; i++) {
            dequeStudent.add(students[i]);
            stackSandwich.add(sandwich[i]);
        }


        for (int i = 0; i < dequeStudent.size(); i++) {
            if (stackSandwich.peek() != dequeStudent.peek()) {
                dequeStudent.offerLast(dequeStudent.peek());
                dequeStudent.remove(dequeStudent.peek());
                unableStudentCount++;

            }
            if (stackSandwich.peek() == dequeStudent.peek()) {
                stackSandwich.remove(stackSandwich.peek());
                dequeStudent.remove(dequeStudent.peek());
                ableStudentCount++;
            }

        }
        return unableStudentCount;


    }
}
