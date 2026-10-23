package section_2;
import java.util.Scanner;
public class numbertinker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		int sum = 0;
		int invert = 0;
		int digit = 0;
		while(n>0) {
			digit=n%10;
			if(digit == k) {
				System.out.printf("Found digit %d\n in the number you entered", k);
			}
			count++;
			sum+=digit;
			invert = invert*10+digit;
			if(invert==n) {
				System.out.println("Palindrom chislo");
			}
			n=n/10;
		}
		System.out.println("suma ot cifri: " + sum);
		System.out.println("broi cifri: " + count);
		System.out.println("mirror number: " + invert);


		
		scanner.close();
	}

}
