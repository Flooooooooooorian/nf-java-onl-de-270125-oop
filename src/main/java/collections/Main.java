package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main extends Object{

    public static void main(String[] args) {
//        String name = "florian";
//
//        String[] names = new String[10];
//
//        names[0] = "florian";
//        names[1] = "Dominic";
//
//        System.out.println(Arrays.toString(names));


//        int[] names = new int[10];
        List<String> names = new ArrayList<>();


        names.add("Florian");
        names.add("Dominic");

        System.out.println(names);

        names.add("Martin");


        System.out.println(names);

        System.out.println(names.get(0));

        System.out.println(names.size());

        names.remove(0);

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (Object name : names) {
            System.out.println(name);
        }

    }
}
