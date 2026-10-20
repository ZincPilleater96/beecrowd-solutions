package pck;
import java.util.Scanner;

public class umnata_lili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = scanner.nextInt();
        double price = scanner.nextDouble();
        double toyPrice = scanner.nextDouble();
        
        int toys = 0;
        double savedmoney = 0;
        int moneygift = 10; 
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toys++;
            } else {
                savedmoney += moneygift;
                savedmoney -= 1;
                moneygift += 10;
            }
        }
        
        savedmoney += toys * toyPrice;
        
        if (savedmoney >= price) {
            double left = savedmoney - price;
            System.out.printf("Yes! %.2f\n", left);
        } else {
            double need = price - savedmoney;
            System.out.printf("No! %.2f\n", need);
        }
        
        scanner.close();
    }
}