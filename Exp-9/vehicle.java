interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a button or key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a key or kick.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        bike.start();
    }
}
