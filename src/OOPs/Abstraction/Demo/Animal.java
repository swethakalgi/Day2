package OOPs.Abstraction.Demo;

abstract class Animal {
    abstract void sound();

    void run() {
        System.out.println("Running..");
    }
}

 class Lion extends Animal{
    void sound(){
        System.out.println("Roars");
    }
 }

 class cat extends Animal{
     @Override
     void sound() {
         System.out.println("Meow");
     }
 }

 class Driver{
     static void main(String[] args) {
         Lion l = new Lion();
         l.sound();
         l.run();

         cat c = new cat();
         c.sound();
         c.run();
     }
 }