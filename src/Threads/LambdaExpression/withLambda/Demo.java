package Threads.LambdaExpression.withLambda;

interface Greeting{
    void sayHello();
}

public class Demo {
    static void main(String[] args) {
        Greeting g = () -> {
            System.out.println("Hello World");
        };
        g.sayHello();
    }
}
//Lambda Expression can be used with only one abstract method.
