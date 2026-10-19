package pck;
import java.util.Scanner;
public class test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i<=n; i++) {
			int x = scanner.nextInt();
			if(x%2==0 && x>0) {
				System.out.println("EVEN POSITIVE");
			}else if(x%2!=0 && x>0) {
				System.out.println("ODD POSITIVE");
			}else if(x%2==0 && x<0) {
				System.out.println("EVEN NEGATIVE");
			}else if(x%2!=0 && x<0) {
				System.out.println("ODD NEGATIVE");
			}else if(x==0) {
				System.out.println("NULL");
			}
		}
		scanner.close();
	}
}












//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int i = 1;
//		while (i<=10000) {
//			if(i%n==2) {
//				System.out.println(i);
//			}
//			i++;
//		}
//	}
//}






//		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
//		if(x%2==0) {
//			x++;
//		}
//		for(int i = 0; i<6; i++)
//		{
//				System.out.println(x);
//				x+=2;
//		}
//		scanner.close();
//	}
//}
