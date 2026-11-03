package arrays;
import java.util.Scanner;
public class BC1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int z = scanner.nextInt();
        while (z <= x) {
            z = scanner.nextInt();
        }
        int sum = 0;
        int counter = 0;
        while (sum <= z) {
            sum += x + counter;
            counter++;
        }
        System.out.println(counter);
        scanner.close();
    }
}