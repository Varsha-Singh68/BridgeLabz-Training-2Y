package generic;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    Apple() { super("Apple"); }
}

class Mango extends Fruit {
    Mango() { super("Mango"); }
}

class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void display() {
        for (T f : list) System.out.println(f);
    }
}

public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Mango());
        box.display();

        
    }
}

