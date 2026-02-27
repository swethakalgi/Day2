package GarbageCollection.Eligibility.ObjectCreatedInsideMethod;

public class Demo {
    static void createObject(){
        Demo obj = new Demo();// after the method execution is over this object in the heap is eligible for garbage collection
    }

    static void main(String[] args) {
        createObject();
    }
}
