import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr, n);
        System.out.println("Minimum is " + min);
        double aver = findAverage(arr, n);
        System.out.println("Average is " + aver);

    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];}
        else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
    public static double findAverage(int[] arr, int n) {
        if (n==0) {
            return 0;
        }
            double sum = findAverage(arr,n-1)*(n-1)+arr[n-1];
            return sum/n;
        }
    }

