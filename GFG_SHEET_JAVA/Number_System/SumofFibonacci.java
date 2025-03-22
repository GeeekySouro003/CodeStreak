// package GFG_SHEET_JAVA.Number_System;

// import java.util.*;
// public class SumofFibonacci {
//     static int calculatesum(int n) {
//         //base case
//         if(n<=0)
//         return 0;
//         if(n==1)
//         return 1;

//         int fibo[]=new int[n+1];//intialize the array 
//         fibo[0]=0 ;
//         fibo[1]=1;
//         int sum=fibo[0]+fibo[1];

//         for(int i=2;i<=n;i++) {
//             fibo[i]=fibo[i-1]+fibo[i-2];
//             sum+=fibo[i];
//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n=sc.nextInt();
//         System.out.println("Sum of fibonacci series is:"+ calculatesum(n));

//         sc.close();
//     }
    
// }


//ALTERNATE APPROACH

package GFG_SHEET_JAVA.Number_System;
import java.util.*;
public class SumofFibonacci{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=0,b=0,sum=1;
        if(n<=0)
        sum=0;
        int curr=1;
        for(int i=1;i<n;i++) {
            a=b;
            b=curr;
            curr=a+b;
            sum+=curr;
        }
        System.out.println("Sum of fibonacci series is :" + sum);
    sc.close();
    }
}