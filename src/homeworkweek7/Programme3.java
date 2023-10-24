package homeworkweek7;

import java.util.Scanner;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme3 {
    public static void main(String[] args) {

        Scanner sc3 = new Scanner(System.in);               //identifying scanner

        System.out.println("Enter student name: ");         //assigning scanner to student name
        String name = sc3.nextLine();

        System.out.println("Enter roll number: ");          //assigning roll number to scanner
        int rollNo = sc3.nextInt();

        System.out.println("Enter marks for Math (out of 100): ");      //calculating grade for maths
        int mathMarks = sc3.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
        System.out.println("Invalid input, Marks should be between 0 to 100");
        return;
        }
        System.out.println("Enter marks for Science (Out of 100): ");           //calculating grade for science
        int scienceMarks = sc3.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
        System.out.println("Invalid input, Marks should be between 0 to 100");
        return;
        }
        System.out.println("Enter marks for English (Out of 100): ");           //calculating grade for english
        int englishMarks = sc3.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
        System.out.println("Invalid input, Marks should be between 0 to 100");
        return;
        }
        int totalMarks = mathMarks + scienceMarks + englishMarks;               //calculating total marks
        double percentage = (double) totalMarks / 300 * 100;

        String result = percentage >= 35 ? "Pass" : "Fail";                 //using if else statement to calculate pass or fail
        String grade;
        if (percentage >=80){
        grade = "A+";
        } else if (percentage >= 60){
        grade = "A";
        } else if (percentage >=50){
        grade = "B";
        } else if (percentage >=35){
        grade = "C";
        } else {
        grade = "D";
        }
        System.out.println("\n_______________________________________");
        System.out.println("|                                       |");
        System.out.println("|             Mark Sheet                |");
        System.out.println("|_______________________________________|");
        //System.out.println("|  Name     : %-15s |\n", + name +      "|");             //this did not work, and I was unable to fix the problem
        //System.out.println("|  Roll No  : % -15d | \n", rollNo     "|");
        System.out.println("|_______________________________________|");
        System.out.println("|  Subject  :   Marks                   |");
        System.out.println("|_______________________________________|");
        //System.out.println("|  Maths    :% -15d |\n",mathMarks     "|");
        //System.out.println("|  Science  :% -15d |\n",scienceMarks"|");
        //System.out.println("|  English  :% -15d |\n",englishMarks "|");
        System.out.println("________________________________________|");
        //System.out.println("|  Total    :% -15d |\n",totalMarks   "|");
        //System.out.println("|  Percentage : % -15d |\n",percentage "|");
        //System.out.println("|  Result   : % - 15s |\n",result     "|");
        //System.out.println("| Grade     : % -15s |\n",grade       "|");
        System.out.println("|_______________________________________|");

        sc3.close();                                                                //closing scanner
    }
    }
