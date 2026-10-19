package pck;
import java.util.Scanner;
public class BC1038 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double price = 0.0;
		int code = scanner.nextInt();
		int quantity = scanner.nextInt();	
		switch(code) {
		case 1:
			price = 4.0;
			break;
		case 2:
			price = 4.5;
			break;
		case 3:
			price = 5.0;
			break;
		case 4:
			price = 2.0;
			break;
		case 5:
			price = 1.5;
			break;
		}
		double total = price*quantity;
		System.out.printf("Total: R$ %.2f\n", total);
		scanner.close();
	}
}

