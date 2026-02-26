package Strings;

public class StringInternFunction {
    static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";

        String s3 = s1.intern();// Check the string pool
        System.out.println(s1==s3);// False
        System.out.println(s2==s3);// True
    }
}
