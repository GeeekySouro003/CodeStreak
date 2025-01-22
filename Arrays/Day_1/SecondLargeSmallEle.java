package Arrays.Day_1;
import java.util.*;

public class SecondLargeSmallEle {

    // Method to find the second smallest element in the array
    public static int secondSmallest(int arr[], int n) {
        if (n < 2) {
            return -1; // Return -1 if the array has less than 2 elements
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        //return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest; // Handle edge cases
    }

    // Method to find the second largest element in the array
    public static int secondLargest(int arr[], int n) {
        if (n < 2) {
            return -1; // Return -1 if the array has less than 2 elements
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        //return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest; // Handle edge cases
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sl = secondLargest(arr, n);
        int sm = secondSmallest(arr, n);

        System.out.println("Second Largest element in the array: " + sl);
        System.out.println("Second Smallest element in the array: " + sm);
    }
}
