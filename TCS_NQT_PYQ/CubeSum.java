import java.util.*;
public class CubeSum {
    public static void sum(int start,int end) {
        int cubesum=0;
        for(int i=start;i<end;i++) {
            cubesum+=Math.pow(i,3);
        }
        System.out.println(cubesum);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        sum(start, end);
        sc.close();

    }
}
