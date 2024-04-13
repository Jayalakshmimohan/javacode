package corejavaexercise;

import java.util.Arrays;
import java.util.Random;
 
public class MyIntArrayUtil {
    public static void main(String[] args) {
        // Step 1: Create an array of ten random int values (1 to 100)
        int[] myArr = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(101);
        }
 
        // Step 2: Display the elements of the array
        System.out.println("Original array:");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(myArr);
 
        // Step 4: Display the sorted elements
        System.out.println("Sorted array in increasing order:");
        for (int num : myArr) {
            System.out.print(num + " ");
        }
    }
}