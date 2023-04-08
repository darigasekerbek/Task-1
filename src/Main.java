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
        String res = findisPrime(n, 2);
        System.out.println("The number is " + res);
        int fact = findFactorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
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
    public static String findisPrime (int n, int a) {
        if (n<=1) {
            return "Composite";}
        else if (n==2) {
            return "Prime";}
        else if (n % a == 0){
            return "Composite";}
        else if (a * a > n){
            return "Prime";}
        else {
            return findisPrime( n, a+1);
        }
    }
        public static int findFactorial(int n) {
            if (n == 1) {
                return 1; }
            else {
                return n * (findFactorial(n - 1));
            }
    }
}



