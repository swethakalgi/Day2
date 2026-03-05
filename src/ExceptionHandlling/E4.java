package ExceptionHandlling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Something: ");
            str = br.readLine();
            System.out.println("You Entered!" + str);
        }finally {
            br.close();
        }
    }
}
