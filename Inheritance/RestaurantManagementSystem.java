package inheritance;

class RestaurantPerson {
    String name;
    int id;

    RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends RestaurantPerson implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef -> Name: " + name + ", ID: " + id + ", Specialty: " + specialty + " | Duties: Cooking meals");
    }
}

class Waiter extends RestaurantPerson implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter -> Name: " + name + ", ID: " + id + ", Tables Assigned: " + tablesAssigned + " | Duties: Serving food");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob", 102, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}

