package arrays;
import java.util.Scanner;
public class array1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[]a = new double[n];
		double sum =0.0;
		for(int i = 0; i <n; i++) {
			a[i] = scanner.nextDouble();
			sum+=a[i];
		}
		System.out.println(sum);
		scanner.close();
	}

}
