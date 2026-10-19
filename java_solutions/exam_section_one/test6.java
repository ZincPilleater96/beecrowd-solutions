package pck;
import java.util.Scanner;
public class test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			if(m<=0 || n<=0) {
				break;
			}
			int sum = 0;
			int min = Math.min(m,n);
			int max = Math.max(m,n);
			for(int i = min; i<=max; i++) {
				sum+=i;
				System.out.print(i+" ");
			}
			System.out.print("Sum=" + sum);
			System.out.println();
		}
		scanner.close();
	}
	
}