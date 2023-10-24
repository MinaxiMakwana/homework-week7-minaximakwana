package homeworkweek7;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */


public class Programme16 {
    public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);            //using scanner
    System.out.println("Enter a number");
    num = sc.nextInt();                             //assigning int value
    if (num > 0) {                                  //if statement and int value more than zero then positive
    System.out.println("Positive number");
    }
    else if(num<0){                                 //else statement negative number
    System.out.println("Negative number");
    }
    else{
    System.out.println("Zero number");
    }
    sc.close();                                     //closing scanner
    }
    }


