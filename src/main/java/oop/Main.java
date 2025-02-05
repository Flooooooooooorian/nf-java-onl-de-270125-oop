package oop;

public class Main {

    public static void main(String[] args) {

        Keyboard kevinsKeyboard = new Keyboard("schwarz/beige", "qwertz", true, "cable");

        kevinsKeyboard.setColor("grün");
        kevinsKeyboard.setLayout("qwerty");
        kevinsKeyboard.setLight(false);
        kevinsKeyboard.setConnection("wireless");

        System.out.println(kevinsKeyboard.getColor());
        System.out.println(kevinsKeyboard.getLayout());
        System.out.println(kevinsKeyboard.isLight());
        System.out.println(kevinsKeyboard.getConnection());


        Keyboard bezisKeyboard = new Keyboard("schwarz", "qwertz", true, "cable");

        System.out.println(bezisKeyboard.getColor());
        System.out.println(bezisKeyboard.getLayout());
        System.out.println(bezisKeyboard.isLight());
        System.out.println(bezisKeyboard.getConnection());


        Keyboard k1 = new Keyboard();
        Keyboard k2 = new Keyboard("grün");


        Keyboard k3 = new Keyboard("grün", "qwerz", true, "cable");
        Keyboard k4 = new Keyboard("grün", "qwerz", true, "cable");

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println(k3 == k4);
        System.out.println(k3.equals(k4));
    }
}
