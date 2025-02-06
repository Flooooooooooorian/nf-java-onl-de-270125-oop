package interfaces;

import java.util.List;

public class Cat extends Object implements Animal {

    private String sound = "miau";
    private String color;

    public void hello() {
        System.out.println("Hello World");
    }

    @Override
    public String move() {
        return "Cat moved: 15";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
               "sound='" + sound + '\'' +
               '}';
    }
}
