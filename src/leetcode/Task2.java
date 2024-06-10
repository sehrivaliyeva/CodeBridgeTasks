package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Task2 {
    static public int[] numberGame(int[] nums) {
       // int Alice = 0;
      //  int Bob = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.offer(num);
        }

        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
          int  Alice = queue.poll();
           int  Bob = queue.poll();

            newArray[i] = Bob;
            newArray[i + 1] = Alice;

        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberGame(new int[]{2, 4, 8, 1, 7})));

    }
}
