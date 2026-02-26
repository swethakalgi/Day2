package OOPs.Abstraction.Interfaces.Demo;

public interface Animal {
    void sound(); // abstract method

    void run(); // abstract method
}

class Lion implements Animal{
    @Override
    public void sound() {
        System.out.println("Roaring...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}

class Driver{
    static void main(String[] args) {
        Lion l = new Lion();
        l.sound();
        l.run();
    }
}
