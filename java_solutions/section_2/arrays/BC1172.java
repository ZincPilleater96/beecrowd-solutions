package arrays;
import java.util.Scanner;
public class BC1172 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < 10; i++) {
            x[i] = scanner.nextInt();
            if (x[i] <= 0) {
                x[i] = 1;
            }	
		}
		for(int j = 0; j<10; j++) {
			System.out.printf("X[%d] = %d\n", j, x[j]);		}
		scanner.close();
	}
}
	