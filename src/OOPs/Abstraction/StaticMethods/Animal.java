package OOPs.Abstraction.StaticMethods;

// abstract class can have static methods
abstract class Animal {
    static void info() { // static methods
        System.out.println("Animals are Living Beings");
    }
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Driver{
    static void main(String[] args) {
        Animal.info();
        Dog d = new Dog();
        d.sound();
    }
}
