package ScannerClass;

import java.util.Scanner;

public class StudentGradingSystem {
    static void main() {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        i=sc.nextInt();
        int totalmarks=i+i+i+i+i;
        System.out.println("Totalmarks:"+totalmarks);
        int percentage=totalmarks/500 * 100;
        System.out.println("Percentage:"+percentage);
        if(percentage>=75){
            System.out.println("A");
        } else if (percentage>=50) {
            System.out.println('B');
        } else if (percentage>=30) {
            System.out.println("C");
        } else {
            System.out.println("Fail!!");
        }
    }
}
