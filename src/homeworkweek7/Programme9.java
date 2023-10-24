package homeworkweek7;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
public class Programme9 {
    public static void main(String[] args) {            //main method
        Scanner sc9 = new Scanner(System.in);           //identifying scanner
        System.out.println("Enter an alphabet from A to F : ");         //assigning scanner to alphabets
        char alphabet = sc9.next().charAt(0);

        switch (alphabet){                                              //using switch statement for output
            case 'A' : System.out.println("Amsterdam"); break;
            case 'B' : System.out.println("Berlin"); break;
            case 'C' : System.out.println("Canberra"); break;
            case 'D' : System.out.println("Dublin"); break;
            case 'E' : System.out.println("Edinburgh"); break;
            case 'F' : System.out.println("Fulda"); break;
            default: System.out.println("Invalid entry. Please enter an alphabet from A to F only");

            sc9.close();            //closing statement
        }
    }
}
