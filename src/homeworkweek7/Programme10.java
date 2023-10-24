package homeworkweek7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10 {
    public static void main(String args[]) {                //main method
        int first, second, add, subtract, multiply;
        float divide;
        Scanner sc3 = new Scanner(System.in);           //identifying scanner

        System.out.print("Enter Two Numbers : ");           //assigning scanner to first and second number
        first = sc3.nextInt();
        second = sc3.nextInt();

        add = first + second;                   //calculation for output
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);

        sc3.close();        //closing scanner
    }
}
