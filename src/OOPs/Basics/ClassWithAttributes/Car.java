package OOPs.Basics.ClassWithAttributes;

public class Car {
    String BrandName;
    int ManuDate;
    String Color;

    public Car(String BrandName, int ManuDate, String Color) {
        this.BrandName = BrandName;
        this.ManuDate = ManuDate;
        this.Color = Color;
    }

    void printDetails() {
        System.out.printf("Car BrandName is %s\n", BrandName);
        System.out.printf("Car ManuDate is %s\n", ManuDate);
        System.out.printf("Car Color is %s\n", Color);
    }

}

class Driver {
    static void main(String[] args) {
        Car c1 = new Car("Audi", 2000, "Red");
        c1.printDetails();
    }
}