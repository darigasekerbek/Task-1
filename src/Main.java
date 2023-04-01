import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int min = findMin(array,n);
        System.out.println("Min is " + min );
        double aver = findAverage(array,n);
        System.out.println("Average is " + min);
    }
    public static int findMin(int[] arr, int n){
        if(n==1)
            return arr[0];
        else {
            int min = findMin(arr ,n-1);
            return Math.min(min,arr[n-1]);
        }
    }
    public static double findAverage(int[] arr, int n){
     int sum = 0;
     for (int i =0; i<n;i++){
      sum += arr[i];
     }
     return sum/n;
    }
}
