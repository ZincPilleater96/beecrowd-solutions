package testprep;
import java.util.Scanner;
public class test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int k = scanner.nextInt();
			int days = scanner.nextInt();
			for(int i = 1; i<days; i++) {
				if(i%2==0) {
					k=k*2; // 2-6 4-12 6-24
				}
			}
		System.out.print(k);
		scanner.close();
	}
}

// 3 6
