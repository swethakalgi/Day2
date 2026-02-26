package OOPs.Abstraction.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor");
    }

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Driver{
    static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

/*
Why does abstract class have Constructors?
-> Constructors are used for initializing common data!
-> When a child class object is created, the Parent class Constructor runs first
-> Parent Constructor is getting executed because of  */