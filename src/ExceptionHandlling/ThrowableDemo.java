package ExceptionHandlling;

public class ThrowableDemo {
    static void function() throws Throwable{
        throw new Throwable("Something went Wrong");
    }
    static void main(String[] args) {
        try {
            function();
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}

/*
throw new Exception("Message")
throw new RuntimeException("Message")
throw new Throwable("Message")

Not Allowed:
throw new String X
throw new Integer X
 */