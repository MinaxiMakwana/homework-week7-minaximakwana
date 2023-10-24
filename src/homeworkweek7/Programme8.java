package homeworkweek7;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {                //main method
        Scanner sc8 = new Scanner(System.in);               //identifying scanner
        System.out.println("Enter an Alphabet from A to F : ");
        char alphabet = sc8.next().charAt(0);                       //assigning scanner to alphabets

        if (alphabet == 'A'){                   //if else statement for output
        System.out.println("Amsterdam");
        } else if (alphabet == 'B'){
        System.out.println("Berlin");
        } else if (alphabet == 'C'){
        System.out.println("Canberra");
        } else if (alphabet == 'D'){
        System.out.println("Dublin");
        } else if (alphabet == 'E'){
        System.out.println("Edinburgh");
        } else if (alphabet == 'F'){
        System.out.println("Fulda");
        } else {
        System.out.println("Invalid entry. Please enter an alphabet from A to F only");

        sc8.close();        //closing scanner
        }
    }
}
