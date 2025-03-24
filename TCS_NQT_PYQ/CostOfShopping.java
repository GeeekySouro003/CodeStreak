import java.util.*;
public class CostOfShopping {
    public static double calculate(int weight,int distance) {
        double baseMoney=5.00;
        double costPerKg = 2.00;
        double costPer10Km = 0.50;

        double weightCost=weight*costPerKg;
        double distanceCost=(distance/10)*costPer10Km;
        double totalcost=baseMoney+distanceCost+weightCost;
        return totalcost;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        int distance=sc.nextInt();
        double totalcost=calculate(weight, distance);
        System.out.printf("$%.2f%n",totalcost);
        sc.close();
    }
    
}
