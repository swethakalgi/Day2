package OOPs.Abstraction.Demo;

abstract class Plant {
    abstract void bloom();

    void grow(){
        System.out.println("Growing..");
    }
}

class Jasmine extends Plant{
    @Override
    void bloom() {
        System.out.println("blooming...");
    }
}

class Herbs extends Plant{
    @Override
    void bloom() {
        System.out.println("Blooms medicinly");
    }
}

class Driver1{
    static void main(String[] args) {
        Jasmine j = new Jasmine();
        j.bloom();
        j.grow();

        Herbs h = new Herbs();
        h.bloom();
        h.grow();
    }
}
