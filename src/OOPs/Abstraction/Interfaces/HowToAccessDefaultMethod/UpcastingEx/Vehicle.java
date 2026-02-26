package OOPs.Abstraction.Interfaces.HowToAccessDefaultMethod.UpcastingEx;

public interface Vehicle {
    void start();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started!");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike Started!");
    }
}

class Driver{
    static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();

        Vehicle v2 = new Bike();
        v2.start();
    }
}