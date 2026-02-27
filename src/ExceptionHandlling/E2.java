package ExceptionHandlling;

public class E2 {
    static void main(String[] args) {
        int i,j, k=0;
        i = 10;
        j = 0;
        try {
            k = i/j;
            System.out.println(k);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
