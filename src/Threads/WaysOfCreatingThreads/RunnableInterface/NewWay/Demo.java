package Threads.WaysOfCreatingThreads.RunnableInterface.NewWay;

public class Demo {
    static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("MyTask1 is Running"));
        Thread t2 = new Thread(() -> {
            for (int i=0; i<10; i++){
                System.out.println("MyTask2 is Running: ");
            }
        });
        t1.start();
        t2.start();
    }
}
