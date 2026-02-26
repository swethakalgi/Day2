package OOPs.Abstraction.Interfaces.Interfaces100NotAbstract;
// why interfaces are not abstract
public interface Demo {
    void show();

    default void display(){
        System.out.println("Default Method!");
    }

    static void message(){
        System.out.println("Static Method!");
    }
}

class Driver{
    static void main(String[] args) {
        Demo.message();
    }
}
