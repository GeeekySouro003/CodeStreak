package GFG_SHEET_JAVA.Arrays;
import java.util.*;

public class FindDuplicates {
    
    // Function to find duplicate elements in an array
    public static List<Integer> find(Integer arr[]) {
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>(); // Fixed incorrect List declaration

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        // Add elements that appear more than once to the result list
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        // If no duplicates are found, add -1 to the list
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String args[]) {
        Integer[] arr = { 1, 6, 5, 2, 3, 3, 2 }; // Sample input
        List<Integer> duplicates = find(arr);

        // Printing the duplicate elements
        System.out.println("Duplicate elements: " + duplicates);
    }
}
