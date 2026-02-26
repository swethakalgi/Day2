package Strings;

public class StringImmutable {
    static void main(String[] args) {
        String str = "Hello";
        str.concat("World");// it does add to Hello word
        System.out.println(str);

        // correctly work with string
        str = str.concat("World");
        System.out.println(str);
    }
}
