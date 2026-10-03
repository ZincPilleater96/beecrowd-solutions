package pck;

import java.util.Scanner;

public class BC1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = ((a * 3.5) + (b * 7.5)) / 11.0;
        System.out.printf("MEDIA = %.5f\n", c);
        scanner.close();
    }
}
