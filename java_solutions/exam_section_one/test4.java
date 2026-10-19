package pck;
import java.util.Scanner;
public class test4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i<n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			int sum = 0;
			for(int j=min+1; j<max; j++) {
				if(j%2!=0) {
					sum+=j;
				}
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}