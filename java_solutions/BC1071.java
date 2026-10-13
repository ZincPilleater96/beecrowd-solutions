package pck;

import java.util.Scanner;

public class BC1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        
        int sum = 0;
        
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        
        System.out.println(sum);
        scanner.close();
    }
}