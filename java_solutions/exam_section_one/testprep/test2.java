package testprep;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int poscount = 0;
		double lastnum = 0.0;
		double finalpos = 0.0;
		int n = scanner.nextInt();
		for(int i = 0; i<n; i++) {
			double x = scanner.nextDouble();
			if(x>0) {
				poscount++;
				if(poscount==3) {
					finalpos=x;
				}
			}
			if(poscount<3)
			{
				lastnum = x;
			}
			
			
		}
		if(poscount<3) {
			System.out.println(lastnum);
		}else {
			System.out.println(finalpos);
		}
		scanner.close();
	}
}

// 1 0 0.5 -4 -12 7.2 -0.23 0.7 5: n=9
// 1 0 -0.5 -4 -12 -0.6 -0.23: n=7
