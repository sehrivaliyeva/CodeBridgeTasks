package collection.task1;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

//Listdəki sözləri terminala yazdıran method yazın

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Attack");
        linkedList.add("Cat");
        linkedList.add("Bubble");
        linkedList.add("Attribute");
        linkedList.add("Determine");

        Iterator<String> iterator = linkedList.iterator();

        writeToTerminal(iterator);
        writeToTerminal1(linkedList);

    }

    //1ci usul
    //iterator() metodu ile yazmisam yuxarida qeyd elemisem
    static void writeToTerminal(Iterator<?> list) {
        while (list.hasNext()) {
            System.out.println(list.next());

        }
    }

    //2ci usul
    // adi LinkedList obyekti qebul edir
    static void writeToTerminal1(LinkedList<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
