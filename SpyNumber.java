package PatternsJava;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int number = sc.nextInt();
        int totalDigits = 0;
        int mulitplyDigits = 1;
        while(number != 0){
            int lastDigit = number % 10;
            totalDigits += lastDigit;
            mulitplyDigits *= lastDigit;
            number /= 10;
            // System.out.println(totalDigits);
        }
        
       if(totalDigits == mulitplyDigits) {
    	   System.out.println("Its Spy Number");
       } else {
    	   System.out.println("It's not a Spy Number");
       }
       sc.close();
    }
}
