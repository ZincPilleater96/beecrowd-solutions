package kontrolno;
import java.util.Scanner;
public class zad3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int days = scanner.nextInt();
		for(int i = 1; i<=days; i++) {
			if(i%2==0) {
				k+=k;
			}
		}
		System.out.println(k);
		scanner.close();
	}

}

//5
//7 - 40
