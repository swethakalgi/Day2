package Threads.WaysOfCreatingThreads.RunnableInterface.OldWay;

//class MyTask implements Runnable{
//    public void run(){
//        System.out.println("Thread is Running");
//    }
//}

public class Demo {
    static void main(String[] args) {
//        MyTask obj = new MyTask();//task not a thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("MyTask1 is Running");
            }
        });// thread1
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("MyTask2 is Running");
            }
        });// thread2
        t1.start();
        t2.start();
    }
}
