package GarbageCollection.Eligibility.ReassigningRefernce;

public class Demo {
    static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = obj2;// 1st obj is now eligible for garbage collection
    }
}
