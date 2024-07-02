package settask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    String name;
    Set<String> set = new HashSet<>();

    public void methodAdd() {
        System.out.println("Elementleri daxil edin : ");

        Scanner scan = new Scanner(System.in);


        while (true) {
            name = scan.nextLine();
            if (name.toLowerCase().startsWith("a")) {
                if (set.add(name)) {

                } else {
                    System.out.println("element already exist ! ");
                }
            } else if (name.toLowerCase().equals("delete")) {
                set.clear();
                System.out.println("set is deleted !");
                break;

            } else {
                System.out.println("This word does not start with A(a)");
                break;
            }
        }
        if (!set.isEmpty()) {
            System.out.println("Elements list:");
            for (String words : set) {

                System.out.println(words);
            }
        } else {
            System.out.println("Set is empty !");
        }

    }

}

