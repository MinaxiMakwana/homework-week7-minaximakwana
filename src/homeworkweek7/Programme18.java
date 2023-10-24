package homeworkweek7;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {                        //main method
        int [] arr = new int[]{10, 20, 30, 40, 50};                 //identifying array
        int sum = 0;                                                //set sum is equal to 0
        for (int i = 0; i < arr.length; i++){                       //loop to calculate sum from array
        sum = sum + arr[i];                                         //adding all the numbers
        }
        System.out.println("Sum of all the numbers are: " + sum);
    }
}
