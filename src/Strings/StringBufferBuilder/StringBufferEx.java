package Strings.StringBufferBuilder;

public class StringBufferEx {
    public void stringAppend() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String: " + sb);
        sb.append("World");
        System.out.println("New String: " + sb);
    }

    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Old String:" +sb);
        sb.insert(1,"EEE");
        System.out.println("New String:" +sb);
    }

    public  void stringReverse(){
        StringBuffer sb = new StringBuffer("HelloWorld");
        System.out.println("Old String:" +sb);
        sb.reverse();
        System.out.println("New String:" +sb);
    }

    static void main(String[] args) {
        StringBufferEx obj = new StringBufferEx();
        obj.stringAppend();
        obj.stringInsert();
        obj.stringReverse();
    }
}
