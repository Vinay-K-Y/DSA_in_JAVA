import java.util.*;
public class sort {

//bubble Sorting 
    public static int[] bubblesort(int arr[]){
        int l=arr.length;
        for(int i=0;i<l;i++){
            for (int j=0;j<l-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }

//selection Sorting 
    public static int[] selectionsort(int arr[]){
        int l=arr.length;
        for (int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        return arr;
    }

//insertion Sorting 
    public static int[] insertionsort(int arr[]){
        int l=arr.length;
        for (int i=1;i<l;i++){
            int current = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.err.println("Enter the length of array:");
        // int size = sc.nextInt();

        int arr[] = {2,5,8,1,2,9,13,5};
        int arr2[]= insertionsort(arr);// call the function based on what algorithm u wanna use
        for(int i=0;i<arr.length;i++){
            System.out.println(arr2[i]);
        }

}
}
