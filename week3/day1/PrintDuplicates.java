package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class PrintDuplicates {
    public static void main(String[] args) {
        // Create array with duplicate values
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 1};
        
        // Method 1: Using nested loops
        findDuplicatesUsingLoops(numbers);
        
    }
    
    // Method 1: Using nested loops
    public static void findDuplicatesUsingLoops(int[] arr) {
        System.out.println("\nMethod 1 - Using Nested Loops:");
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Duplicate values: ");
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;  // To avoid printing same duplicate multiple times
                }
            }
        }
    }
   }