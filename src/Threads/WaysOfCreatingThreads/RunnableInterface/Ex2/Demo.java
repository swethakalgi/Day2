package Threads.WaysOfCreatingThreads.RunnableInterface.Ex2;

class MyTask implements Runnable{
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Threads:" + i);
        }
    }
}

public class Demo {
    static void main(String[] args) {
        MyTask obj = new MyTask();//task not a thread
        Thread t1 = new Thread(obj);//thread1
        Thread t2 = new Thread(obj);//thread2
        t1.start();
        t2.start();
        for (int i=0; i<5; i++){
            System.out.println("Main Thread: " + i);
        }
    }
}
