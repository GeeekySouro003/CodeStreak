package GFG_SHEET_JAVA.Strings;

import java.util.Arrays;

public class CheckAnagram {
    public static boolean check(String str1,String str2) {
        //for sorting convert string to character Array
        char s1arr[]=str1.toCharArray();
        char s2arr[]=str2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        return Arrays.equals(s1arr, s2arr);
    }
    public static void main(String args[]) {
        String s1="geeks";
        String s2="kseeg";
        System.out.println(check(s1, s2));
    }
}
