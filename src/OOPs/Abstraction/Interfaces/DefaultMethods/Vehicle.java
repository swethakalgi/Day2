package OOPs.Abstraction.Interfaces.DefaultMethods;

public interface Vehicle {
    void start();//abstract method

    default void stop(){
        System.out.println("Engine Stopped!");
    }
}

class Audi implements Vehicle{
    @Override
    public void start() {
        System.out.println("Audi has started!");
    }
}
class BMW implements Vehicle{
    @Override
    public void start() {
        System.out.println("BMW has started!");
    }
}
class RolceRoyce implements Vehicle{
    @Override
    public void start() {
        System.out.println("RolceRoyce has started!");
    }
}

class Driver{
    static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.stop();
    }
}
