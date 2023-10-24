package homeworkweek7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme12 {
    public static void main(String[] args) {                    //main method
        Scanner sc2 = new Scanner(System.in);                   //assigning scanner
        char ch;                                               //declaring character
        System.out.println("Enter any character ");
        ch = sc2.next().charAt(0);                            //assigning character
        //assigning A to Z and a to z lowercase and upper case
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' & ch <= 'z') {          //calculation and if else statement for output
        System.out.println(ch + "is an alphabet");
        } else if (ch>= '0' && ch <='9' ) {
        System.out.println(ch + "is not an alphabet");
        } else{
        System.out.println("This is a special character");
        }
        sc2.close();                //closing scanner
    }
}



