package arrays;
import java.util.Scanner;
import java.lang.Math;
public class BC1164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            boolean isPerfect = false;
            if (x > 1) {
                int sum = 1;
                double sqrtvalue = Math.sqrt(x);
                for (int j = 2; j <= Math.floor(sqrtvalue); j++) {
                    if (x % j == 0) {
                        sum += j;
                        if (j != sqrtvalue) {
                            sum += x / j;
                        }
                    }
                }
                if (sum == x) {
                    isPerfect = true;
                }
            }
            if (isPerfect) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }
        
        scanner.close();
    }
}