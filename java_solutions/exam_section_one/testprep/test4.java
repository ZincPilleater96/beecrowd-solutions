package testprep;
import java.util.Scanner;
public class test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int evenpos = 0; int finaleven = 0; int firstnum=0;
		for(int i = 0; i<n; i++) {
			int x = scanner.nextInt();
			if(i==0){
				firstnum = x;
			}
			if(x%2==0) {
				evenpos++;
			}
			if(evenpos==2) {
				finaleven = x;
			}
		}
		if(evenpos<2) {
			System.out.println(firstnum);
		}else {
			System.out.println(finaleven);
		}
		scanner.close();
	}
}

//6
//1 3 4 7 8 10
//4
//3 5 4 9
