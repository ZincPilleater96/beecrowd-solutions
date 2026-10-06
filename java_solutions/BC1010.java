package pck;
import java.util.Scanner;

public class BC1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        for (int i = 0; i < 2; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int code = Integer.parseInt(parts[0]);     
            int units = Integer.parseInt(parts[1]);   
            double price = Double.parseDouble(parts[2]); 
            total += (units * price);
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        scanner.close();
    }
}
