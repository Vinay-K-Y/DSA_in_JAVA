import java.util.*;
public class Knapsack {
    static class ItemCompare implements Comparator<int[]>{
        public int compare(int[] a , int[] b){
            double a1 = (1.0 * a[0])/a[1];
            double b1 = (1.0 * b[0])/b[1];
            return Double.compare(b1, a1);
        }
    }

    static double FKnapsack(int[] profit,int[] weight,int capacity){
        int l=  profit.length;

        int[][] items = new int[l][2];
        for(int i=0;i< l;i++){
            items[i][0]= profit[i];
            items[i][1]=weight[i];
        }

        Arrays.sort(items, new ItemCompare());

        double pro = 0.0;
        int cc= capacity;

        for (int i =0;i<l;i++){
            if(items[i][1]<=cc){
                pro += items[i][0];
                cc -= items[i][1];
            }else {
                pro += (1.0 * items[i][0]/items[i][1]) * cc;
                break;
            }
        }
        return pro;
    }
    public static void main(String[] args) {
        int[] profit = {25, 24, 15};
        int[] weight = {18, 15, 10};
        int capacity = 20;

        System.out.println(FKnapsack(profit, weight, capacity));
    }
}
