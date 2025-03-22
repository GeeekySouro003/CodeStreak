package GFG_SHEET_JAVA.Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static int remove(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        int updatedIndex = 0;  // Start from 0

        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {  
                hs.add(arr[i]);  // Store unique elements
                arr[updatedIndex++] = arr[i];  // Move element to the front
            }
        }
        return updatedIndex;  // Return the new size of the array
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = remove(arr);

        // Print unique elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
