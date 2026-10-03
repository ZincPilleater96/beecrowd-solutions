package pck;

import java.util.Scanner;
public class BC1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double a, b, c, d;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = ((a * 2) + (b * 3) + (c * 5)) / 10.0;
        System.out.printf("MEDIA = %.1f\n", d);
        
        scanner.close();
    }
}