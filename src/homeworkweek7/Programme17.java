package homeworkweek7;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        int [] arr = new int[]{90,85,70,60,75,82,34,1,55,80,9,16,-80,-82,120,800,1020};         //created array
        System.out.println("Array after sorting smallest to largest");
        for (int i = 0; i < arr.length; i++){                                                   //array calculation
        for (int j = i + 1; j < arr.length; j++){
        int tmp = 0;
        if (arr[i] > arr[j]){
        tmp = arr[i];
        arr[i]= arr[j];
        arr[j] = tmp;
        }
        }
        System.out.println(arr[i]);                    //to be able to sort the array into smallest to largest
        }
    }
}
