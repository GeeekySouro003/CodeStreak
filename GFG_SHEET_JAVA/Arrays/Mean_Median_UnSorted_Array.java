package GFG_SHEET_JAVA.Arrays;

import java.util.Arrays;

public class Mean_Median_UnSorted_Array {
    public static int findMean(int arr[]) {
        //Array.sort(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            
        }
        return sum/arr.length;
    }

    public static int findMedian(int arr[]) {
        int n=arr.length;
        if(n%2==0) {
            return (arr[n/2]+arr[(n/2)-1])/2;
        }
        else {
            return arr[n/2];
        }
    }
    public static void getMeanMedian(int arr[]) {
        Arrays.sort(arr);
        System.out.println(findMean(arr)+ " " + findMedian(arr));
    }

    public static void main(String args[]) {
        int arr[]={4, 2, 9, 4, 1, 2, 8, 9, 5, 1};
        getMeanMedian(arr);
    }
}
