package arrays;
import java.util.Scanner;
public class BC1176 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long[] fib = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for(int j = 0; j<n; j++) {
        	arr[j] = scanner.nextInt();
        	System.out.printf("Fib(%d) = %d\n", arr[j], fib[arr[j]]);
        }
        scanner.close();        	
        }
    }