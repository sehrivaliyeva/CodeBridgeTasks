package leetcode;

import java.util.HashSet;

public class Task5 {
    static public int findJewels(String jewels, String stones) {

        int count = 0;
        char[] jewelsArray = new char[jewels.length()];

        for (int i = 0; i < jewelsArray.length; i++) {
            jewelsArray[i] = jewels.charAt(i);

        }

        HashSet<Character> jewelSet = new HashSet<>();
        for (int i = 0; i < jewelsArray.length; i++) {
            jewelSet.add(jewelsArray[i]);
        }



        char[] stonesArray = new char[stones.length()];
        for (int i = 0; i < stonesArray.length; i++) {
            stonesArray[i] = stones.charAt(i);

        }

        for(int i=0;i<stonesArray.length;i++){

            if(jewelSet.contains(stonesArray[i])){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(Task5.findJewels("aAc", "acAAAlmnml"));

    }
}
