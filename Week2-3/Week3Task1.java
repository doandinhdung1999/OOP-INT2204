package week3_task1;
import java.util.Scanner;
public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public static int gcd(int a, int b) {
        while(a!= b){
        if(a>b) a= a-b;
        else b= b-a;
        }
        return (a);
        
    }
    
    private static Scanner scanner = new Scanner(System.in);
    



    // compute the fibonacci of $n
   public static int fibonacci(int n) {
    
    int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    
    public static boolean isPrimeNumber(int n) {
       
        if (n < 2) {
            return false;
        }
       
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static void sieveEratosthenes(int n) {

        for (int i = 0; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            
    }
        }
    }


public static void main(String[] args) {
    
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        
        System.out.println( gcd(a, b)); 
        System.out.println(fibonacci(n));
        sieveEratosthenes(n);
        
}
}