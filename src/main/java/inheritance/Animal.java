package inheritance;

import java.util.Objects;

public class Animal {

    protected boolean saeugetier;
    protected int countExtremtiaeten;
    protected String color;

    public Animal() {
        System.out.println("Important variable");
    }

    public Animal(boolean saeugetier, int countExtremtiaeten, String color) {
        this.saeugetier = saeugetier;
        this.countExtremtiaeten = countExtremtiaeten;
        this.color = color;
        System.out.println("Important variable");
    }

    public void move(int distance) {
        System.out.println("Animal moved: " + distance);
    }

    public boolean isSaeugetier() {
        return saeugetier;
    }

    public void setSaeugetier(boolean saeugetier) {
        this.saeugetier = saeugetier;
    }

    public int getCountExtremtiaeten() {
        return countExtremtiaeten;
    }

    public void setCountExtremtiaeten(int countExtremtiaeten) {
        this.countExtremtiaeten = countExtremtiaeten;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return saeugetier == animal.saeugetier && countExtremtiaeten == animal.countExtremtiaeten && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saeugetier, countExtremtiaeten, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
               "saeugetier=" + saeugetier +
               ", countExtremtiaeten=" + countExtremtiaeten +
               ", color='" + color + '\'' +
               '}';
    }
}
