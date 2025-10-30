package functional_interface;

class Product implements Cloneable {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototypeObject {
    public static void main(String[] args) {
        try {
            Product p1 = new Product(101, "Laptop");
            Product p2 = (Product) p1.clone();

            System.out.println("Original Product: " + p1.id + " - " + p1.name);
            System.out.println("Cloned Product:   " + p2.id + " - " + p2.name);
        } 
        catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}

