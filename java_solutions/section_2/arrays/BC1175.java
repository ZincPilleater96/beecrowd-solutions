package arrays;
import java.util.Scanner;
public class BC1175 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[20];
        for (int i = 0; i < 20; i++) {
            n[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int temp = n[i];
            n[i] = n[19 - i];
            n[19 - i] = temp;
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
        
        scanner.close();
    }
}
