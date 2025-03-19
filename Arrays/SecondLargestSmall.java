package Arrays;
public class SecondLargestSmall {
    static public int secondSmallest(int arr[],int n) {
        if(n<2) {
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i]<small) {
                second_small=small;
                small=arr[i];
                
            }
            else if(arr[i]<second_small && arr[i]!=small) {
                second_small=arr[i];
            }
        }
        return second_small;
    }
    static public int secondLargest(int arr[],int n) {
        if(n<2) {
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>large) {
                secondlarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondlarge&& arr[i]!=large) {
                secondlarge=arr[i];
            }
        }
        return secondlarge;
    }
    public static void main(String args[]) {
        int arr[]={10,5,7,8,5,2,14};
        int n=arr.length;
        int SexLargest=secondLargest(arr, n);
        int SexSmallest=secondSmallest(arr, n);
        System.out.println("Second largest:"+ SexLargest);
        System.out.println("Second smallest:"+ SexSmallest);
    }
}
