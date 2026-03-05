package Threads.WaysOfCreatingThreads.ThreadClass.Ex1;
// MultiThread Environment
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class Demo {
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
