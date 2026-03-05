package Threads.MainSingleThread;

public class Demo {
    static void main(String[] args) {
        System.out.println("Main Thread Started!");
        for (int i=0; i<5; i++){
            System.out.println("Main Thread: " + i);
        }
        System.out.println("Main Thread Stopped!");
    }
}
