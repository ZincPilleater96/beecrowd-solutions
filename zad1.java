package kontrolno;
import java.util.Scanner;
public class zad1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 1;
		int n = scanner.nextInt();
		for(int i = 1; i<=n; i++) {
			sum = sum*i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
 
//4 - 24
