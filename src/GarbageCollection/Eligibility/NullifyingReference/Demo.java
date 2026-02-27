package GarbageCollection.Eligibility.NullifyingReference;

public class Demo {
    static void main(String[] args) {
        Demo obj = new Demo();
        obj = null;//This is now eligible for garbage collection
    }
}
