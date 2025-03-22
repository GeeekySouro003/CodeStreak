package GFG_SHEET_JAVA.Number_System;

import java.util.Arrays;

public class MaxProductThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[n-1] * nums[n-2] *nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }

    public static void main(String args[]) {
        int nums[]={-1,-2,3,5,-6};
        System.out.println(maximumProduct(nums));
    }
}
