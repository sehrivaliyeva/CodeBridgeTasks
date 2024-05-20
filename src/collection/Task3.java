package collection;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        // 3 - cü və 4 - cü elementlərin arasina “Blue”sözünü əlavə edin
        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        addElement(list, 4, "Bule");
        for (String s : list) {
            System.out.println(s);
        }
    }

    static void addElement(LinkedList<String> linkedList, int index, String data) {
        if (index >= 0 && index < linkedList.size()) {
            linkedList.add(index, data);
        }
    }
}
