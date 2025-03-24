import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their corresponding indices
        Map<Integer, Integer> hs = new HashMap<>();
        int n = nums.length;

        // First, populate the HashMap with the numbers as keys and their indices as values
        for (int i = 0; i < n; i++) {
            hs.put(nums[i], i);
        }

        // Iterate through the array to find two numbers that add up to the target
        for (int i = 0; i < n; i++) {
            int comp = target - nums[i]; // Calculate the complement of the current number
            
            // Check if the complement exists in the HashMap and ensure it's not the same element
            if (hs.containsKey(comp) && hs.get(comp) != i) {
                return new int[] { i, hs.get(comp) }; // Return the indices of the two numbers
            }
        }
        
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
