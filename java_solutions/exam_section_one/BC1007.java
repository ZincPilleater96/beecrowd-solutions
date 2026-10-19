package pck;
import java.util.Scanner;
public class BC1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int a, b, c, d, e;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = (a * b) - (c * d);
        System.out.println("DIFERENCA = " + e);
        scanner.close();
    }
}