package interfaces;

public class Main {

    public static void main(String[] args) {
        //Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.move());
        System.out.println(cat.move());

        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        System.out.println(animal2.toString());
        System.out.println(animal3);

        Animal[] animals = new Animal[10];
        animals[0] = animal2;
        animals[1] = animal3;
        animals[2] = new Dog();
        animals[3] = new Cat();
        animals[4] = dog;
        animals[5] = cat;

//        Cat originalCat = animals[5];

    }
}
