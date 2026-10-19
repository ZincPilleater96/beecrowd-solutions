package pck;
import java.util.Scanner;
public class test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double A,B,C;
		if(n1>=n2 && n1>=n3) {
			A = n1;
			if(n2>=n3) {
				B=n2;
				C=n3;
			}
			else {
				B=n3;
				C=n2;
			}
		}else if(n2>=n1 && n2>=n3) {
			A = n2;
			if(n1>=n3) {
				B=n1;
				C=n3;
			}
			else {
				B=n3;
				C=n1;
			}
		}else{
			A = n3;
			if(n2>=n1) {
				B=n2;
				C=n1;
			}
			else {
				B=n1;
				C=n2;
			}
		}
		if(A>= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if(A*A == B*B+C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}else if(A*A > B*B+C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}else if(A*A < B*B+C*C) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
		}
		if(A==B && A==C) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if(A==B || B==C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		scanner.close();
	}
}
