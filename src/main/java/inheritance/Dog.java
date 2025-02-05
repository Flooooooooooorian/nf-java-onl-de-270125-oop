package inheritance;

import java.util.Objects;

public class Dog extends Animal {

    private String name;

    public Dog() {
        super();
    }

    public Dog(boolean saeugetier, int countExtremtiaeten, String color, String name) {
        super(saeugetier, countExtremtiaeten, color);
        this.name = name;
    }

    @Override
    public void move(int distance) {
        super.move(distance);
        System.out.println("Dog moved: " + (distance * 1.5));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Dog{" +
               "name='" + name + '\'' +
               ", saeugetier=" + saeugetier +
               ", countExtremtiaeten=" + countExtremtiaeten +
               ", color='" + color + '\'' +
               '}';
    }
}
