package collections;

import java.util.*;

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

//        int[] names = new int[10];
        //List<String> names = new ArrayList<>();
        Map<String, Book> bookMap = new HashMap<>();

        Book b1 = new Book();
        bookMap.put("1", b1);
        bookMap.put("2", new Book());

        System.out.println(bookMap);
        System.out.println(bookMap.get("1"));

        bookMap.remove("1");
        System.out.println(bookMap);

        if (!bookMap.containsKey("2")) {
            bookMap.put("2", new Book());
        }


        Set<Book> bookSet = new HashSet<>();

        bookSet.add(b1);

        System.out.println(bookSet);

        bookSet.remove(b1);
        System.out.println(bookSet);

        bookSet.add(b1);
        bookSet.add(b1);
        bookSet.add(b1);
        bookSet.add(b1);

        System.out.println(bookSet);

        for (Book book : bookSet) {
            System.out.println(book);
        }

    }
}
