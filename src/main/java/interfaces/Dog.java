package interfaces;

public class Dog implements Animal{

    private String sound = "wau";
    private int distance;

    @Override
    public String move() {
        return "Dog moved distance: " + distance;
    }

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public String toString() {
        return "Dog{" +
               "distance=" + distance +
               ", sound='" + sound + '\'' +
               '}';
    }
}
