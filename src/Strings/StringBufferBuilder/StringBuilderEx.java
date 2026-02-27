package Strings.StringBufferBuilder;

public class StringBuilderEx {
    public void stringAppend() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String: " + sb);
        sb.append("World");
        System.out.println("New String: " + sb);
    }

    public void stringInsert(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String:" +sb);
        sb.insert(1,"EEE");
        System.out.println("New String:" +sb);
    }

    public  void stringReverse(){
        StringBuilder sb = new StringBuilder("HelloWorld");
        System.out.println("Old String:" +sb);
        sb.reverse();
        System.out.println("New String:" +sb);
    }

    static void main(String[] args) {
        StringBuilderEx obj = new StringBuilderEx();
        obj.stringAppend();
        obj.stringInsert();
        obj.stringReverse();
    }
}