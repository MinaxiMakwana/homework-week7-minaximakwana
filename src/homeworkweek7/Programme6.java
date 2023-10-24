package homeworkweek7;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */


public class Programme6 {
    public static void main(String[] args) {            //main method
        Scanner sc3 = new Scanner(System.in);           //identifying scanner
        System.out.println("Enter any number : ");      //assigning scanner to number
        int num = sc3.nextInt();
        if (num % 2 == 0) System.out.println(num + " is even");         //calculating odd or even number
        else System.out.println(num + " is odd");

        sc3.close();          //closing scanner
    }
}
