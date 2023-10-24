package homeworkweek7;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {
    public static void main(String[] args) {
        int[] numbers = new int[] {10, 20, 30, 40, 50, 60};
        int sum = 0;                                                //calculate sum of all array elements
        for (int i=0; i < numbers.length; i++)
        sum = sum + numbers[i];
        double average = sum / numbers.length;                      //calculate average value
        System.out.println("Average value of the array elements is : " + average);
    }
}
