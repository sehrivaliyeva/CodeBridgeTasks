package collection.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
    private int maxSize;
    private int top;

    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(int[] stackArray) {
        this.stackArray = stackArray;
    }


    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("stack doludur ");

        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return stackArray[top--];
        }
    }


    /*bu formada elemek istedim alinmadi
    /* kodun partdamagini istemirem
    /*Integer kimi yaza bileremmi?
    /*ama stack null deyer de qebul edir
     */

   /* public Integer pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            return value;
        } else {
            return null;
        }

    }*/


    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //bu formada da yaza bilerem?

   /* public boolean isEmpty() {
        if (top == -1) {
            System.out.println("stack boshdur");
            return false;
        } else {
            System.out.println("stackde elementler var");
            return true;

        }
    }*/

    // ve ya return top yazsaq da olar?
    public int size() {
        return stackArray.length;
    }


}

