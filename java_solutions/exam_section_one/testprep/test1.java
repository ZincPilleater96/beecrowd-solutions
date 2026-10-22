package testprep;
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumchet = 0; int sumnechet = 0;
		int n = scanner.nextInt();
		for(int i = 0; i<n; i++) {
			int x = scanner.nextInt();
			if(x%2==0) {
				sumchet +=x;
			}
			else {
				sumnechet+=x;
			}
		}
		System.out.println(sumchet + " //Suma na chetni");
		System.out.println(sumnechet + " //Suma na nechetni");
		scanner.close();
	}

}
