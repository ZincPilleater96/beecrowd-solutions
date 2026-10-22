package testprep;
import java.util.Scanner;
public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int k = scanner.nextInt();
			int days = scanner.nextInt();
			for(int i = 1; i<=days; i++) {
				if(i%2==0) {
					k+=k;
				}
			}
		System.out.print(k);
		scanner.close();
	}
}

// 5 7
