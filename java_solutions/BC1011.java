package pck;
import java.util.Scanner;

public class BC1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int radius = scanner.nextInt();
        final double pi = 3.14159;
        double calc = (4.0/3.0) * pi * Math.pow(radius, 3);
        System.out.printf("VOLUME = %.3f\n", calc);
        scanner.close();
    }
}
