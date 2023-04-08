import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
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
        int fibon = findFibonacci(n);
        System.out.println("Fibonacci sequence " + fibon);
        int pow = findPower(a,n);
        System.out.println(a + " to the power " + n + " is "+ pow);
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
    public static int findFibonacci(int n){
        if (n <= 1){
            return n;}
        else {
            return findFibonacci(n-1)+findFibonacci(n-2);}
    }
    public static int findPower(int a, int n){ // a = 2, n = 10, 2^10=1024
        if(n == 0)
            return 1;
        else if (n == 1)
            return a;
        else
            return a * findPower(a, n-1);
    }
}



