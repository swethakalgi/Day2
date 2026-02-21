package OOPs.ConstructorDemo;

public class Demo {
    Demo() {
        System.out.println("I'm a Constructor!");
    }
}

class Driver{
    static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
    }
}
