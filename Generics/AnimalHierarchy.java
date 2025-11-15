package generic;

import java.util.*;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Dog extends Animal {
    Dog() { super("Dog"); }
}

class Cat extends Animal {
    Cat() { super("Cat"); }
}

class AnimalUtil {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        AnimalUtil.printAnimals(dogs);
        AnimalUtil.printAnimals(cats);
    }
}

