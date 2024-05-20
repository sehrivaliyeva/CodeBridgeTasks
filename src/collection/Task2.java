package collection;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        //Yeni bir LinkedList yaradaraq digər iki listin elementlərini ora əlavə
        //edin. Bunu methodlarla eləməlisiniz.

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("RedC1");
        list1.add("GreenC1");
        list1.add("BlackC1");
        list1.add("WhiteC1");
        list1.add("PinkC1");

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("RedC2");
        list2.add("GreenC2");
        list2.add("BlackC2");
        list2.add("PinkC2");

        concatTwoLists(list1, list2);


    }

    static LinkedList<String> newLinkedList = new LinkedList<>();

    static public void concatTwoLists(LinkedList<String> linkedList, LinkedList<String> linkedList1) {

        for (int i = 0; i < linkedList.size(); i++) {
            newLinkedList.add(linkedList.get(i));
        }

        for (int i = 0; i < linkedList1.size(); i++) {
            newLinkedList.add(linkedList1.get(i));
        }

        for (String s : newLinkedList) {
            System.out.println(s);
        }
    }


}
