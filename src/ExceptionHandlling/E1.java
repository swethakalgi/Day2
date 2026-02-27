package ExceptionHandlling;

public class E1 {
    static void main(String[] args) {
        int i, j, k=0;
        i = 10;
        j = 0;
        try {
            k = i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("Undefined");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }catch (Exception e){
            System.out.println("Unknown Exception Occurred");
        }finally {
            System.out.println("This will get executed no matter what");
        }
        System.out.println("Hello");
    }static {
        System.out.println("Execution Starts!");
    }
}
