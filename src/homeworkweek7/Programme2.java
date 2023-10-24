package homeworkweek7;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2 {
    public static void main(String[] args) {                                    //main method
        Scanner sc5 = new Scanner(System.in);                                   //identifying scanner
        System.out.print("Input the year: ");
        int year = sc5.nextInt();

        boolean x = (year % 4) ==0;
        boolean y = (year % 100)!= 0;
        boolean z = ((year %100 == 0) && (year % 400 == 0));

        if (x && (y || z)){ System.out.println(year + " is a leap year");       //calculation for leap year using if else statement
        } else {
        System.out.println(year + " is not a leap year");

        sc5.close();                                                            //closing scanner
        }
    }
}
