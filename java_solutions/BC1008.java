package pck;
import java.util.Scanner;
public class BC1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int hours, number;
        double salary, hourpay;
        number = scanner.nextInt();
        hours = scanner.nextInt();
        hourpay = scanner.nextDouble();
        salary = hours*hourpay;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scanner.close();
    }
}