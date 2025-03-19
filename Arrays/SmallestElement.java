package Arrays;

import java.util.Scanner;
public class SmallestElement {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String small=null;

        System.out.println("Enter the elements:");

        while(sc.hasNext()) {
            String str=sc.next();
            if(str.equalsIgnoreCase("RUKOOO")) 
            break;
            if(small==null || str.compareTo(small)<0) {
                small=str;
            }
        }
        sc.close();
        System.out.println("Smallest element is :"+small);
    }
}
   
