package OOPs.Encapsulation;

public class Student {
    private String name;
    private int usn;

    Student(String name, int usn){
        this.name = name;
        this.usn = usn;
    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    int getUsn(){
        return this.usn;
    }

    void setUsn(int usn){
        this.usn = usn;
    }

    void printDetails(){
        System.out.println("Student name is:" + this.name);
        System.out.println("Student usn is: "+ this.usn);
    }
}

class Driver{
    static void main(String[] args) {
        Student s1 = new Student("Swetha", 115);
        s1.printDetails();
        System.out.println("name is:" +s1.getName());
        s1.setName("Mouni");
        System.out.println("name is:" +s1.getName());
    }
}
