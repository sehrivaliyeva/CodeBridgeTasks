package leetcode;

import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 8, 9, 3, 5};
        Arrays.sort(array);

        //arrayin en boyuk elementlerini tapiram
        int ilkBoyuk = array[array.length - 1];
        int sonBoyk = array[array.length - 2];

        int netice = ((ilkBoyuk - 1) * (sonBoyk - 1));
        System.out.println(netice);

    }


}