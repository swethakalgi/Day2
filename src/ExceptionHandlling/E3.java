package ExceptionHandlling;

public class E3 {
    static void checkAge(int age){
        if (age >= 18){
            System.out.println("Eligible - Access Granted!");
        }else {
            throw new RuntimeException("Not Eligible - Access Denied!");
        }
    }

    static void main(String[] args) {
//        checkAge(12);
        checkAge(25);
    }
}
