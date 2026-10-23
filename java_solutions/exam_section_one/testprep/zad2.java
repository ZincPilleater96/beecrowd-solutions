package kontrolno;
import java.util.Scanner;
public class zad2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sum = scanner.nextDouble();
		double p = scanner.nextDouble();
		double lihvapercent = p/100;
		double totalsum = 0;
		int years = scanner.nextInt();
		for(int i = 1; i<=years; i++) {
			totalsum = sum*(1+lihvapercent);
			sum = totalsum;
		}
		System.out.printf("%.2f",totalsum);
		scanner.close();
	}

}
//700
//2.4
//4 - 769.66

//1000
//5
//3 - 1157.63
