package ExceptionHandlling;

import java.io.IOException;

public class CheckedException {
    static void readFile() throws IOException{
        throw new IOException("File not found");
    }

    static void display() throws IOException{
        readFile();
    }

    static void show() throws IOException{
        display();
    }

    static void main(String[] args) {
        try {
            show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
