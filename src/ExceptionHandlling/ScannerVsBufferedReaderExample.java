package ExceptionHandlling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerVsBufferedReaderExample {
    static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);
    }
}
