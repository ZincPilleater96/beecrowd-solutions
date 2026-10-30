package arrays;
import java.util.Scanner;
public class BC1175 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int j = 2; j <= n; j += 2) {
			  System.out.printf("%d^2 = %d\n", j, j*j);
		    }
		scanner.close();
	}
}
	