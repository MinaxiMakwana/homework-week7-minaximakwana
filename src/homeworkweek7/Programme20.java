package homeworkweek7;
/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class Programme20 {

    public static void main(String[] args) {
    int [] array1 = {1, 2, 3, 4, 5, 6};
    System.out.println(contains(array1, 6));
    System.out.println(contains(array1, 9 ));
    }
    public static boolean contains(int[] arr, int item){
    for (int a: arr){
    if (item == a){
    return true;
    }
    }
    return false;

    }
}


