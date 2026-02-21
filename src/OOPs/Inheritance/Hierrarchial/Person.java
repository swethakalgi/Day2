package OOPs.Inheritance.Hierrarchial;

public class Person {
    String Fname;
    String Lname;

    Person(String Fname, String Lname){
        this.Fname = Fname;
        this.Lname = Lname;
    }
}

class Student extends Person{
    int usn;
    Student(String Fname, String Lname, int usn){
        super(Fname, Lname);
        this.usn = usn;
    }
}

class Driver{
    static void main(String[] args) {
        Student s1 = new Student("Swetha", "Kalgikar", 11);
    }
}
