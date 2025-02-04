public class Main {

    public static void main(String[] args) {

        Keyboard kevinsKeyboard = new Keyboard("schwarz/beige", "qwertz", true, "cable");

//        kevinsKeyboard.color = "schwarz/beige";
//        kevinsKeyboard.layout = "qwertz";
//        kevinsKeyboard.light = true;
//        kevinsKeyboard.connection = "cable";

        System.out.println(kevinsKeyboard.color);
        System.out.println(kevinsKeyboard.layout);
        System.out.println(kevinsKeyboard.light);
        System.out.println(kevinsKeyboard.connection);


        Keyboard bezisKeyboard = new Keyboard("schwarz", "qwertz", true, "cable");

        System.out.println(bezisKeyboard.color);
        System.out.println(bezisKeyboard.layout);
        System.out.println(bezisKeyboard.light);
        System.out.println(bezisKeyboard.connection);


        Keyboard k1 = new Keyboard();
        Keyboard k2 = new Keyboard("grün");
        Keyboard k3 = new Keyboard("grün", "qwerz", true, "cable");
    }
}
