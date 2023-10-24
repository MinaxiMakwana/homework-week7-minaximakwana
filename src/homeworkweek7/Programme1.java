package homeworkweek7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */


public class Programme1 {
    public static void main(String[] args) {                //main method
        Scanner sc5 = new Scanner(System.in);               //identifying scanner
        System.out.println("Enter number to test");
        int num = sc5.nextInt();
        sc5.close();                                        //closing scanner
        String result = num % 2 == 0 ? "Even" : "Odd";      //calculating even and odd number
        System.out.println(num + " is " + result);
    }
}
