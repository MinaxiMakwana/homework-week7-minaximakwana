package homeworkweek7;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {
    public static void main(String[] args) {                    //main method
        Scanner sc1 = new Scanner(System.in);                   //scanner method
        System.out.println("Enter number between 1 to 7");
        int day = sc1.nextInt();                                //assigning scanner to sc1

        System.out.println(getDayName(day));

        sc1.close();                //closing scanner
    }

    public static String getDayName(int day){
        String dayName = "";                                    //using switch function to get the days of the week

        switch (day){                                           //switch method for output
            case 1: dayName = "Monday";break;
            case 2: dayName = "Tuesday";break;
            case 3: dayName = "Wednesday";break;
            case 4: dayName = "Thursday";break;
            case 5: dayName = "Friday";break;
            case 6: dayName = "Saturday";break;
            case 7: dayName = "Sunday";break;
            default: dayName = "Week contains 1 to 7 days";
            }
            return dayName;
            }
            }

