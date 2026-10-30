package arrays;
import java.util.Scanner;
public class BC1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = n / 2;
        int[] even = new int[size];        
        int index = 0;
        for (int i = 2; i <= n; i += 2) {
            even[index] = i * i; 
            index++;         
        }
        for (int j = 0; j < size; j++) {
            int currevn = (j + 1) * 2;
            System.out.printf("%d^2 = %d\n", currevn, even[j]);
        }
        
        scanner.close();
    }
}
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		for (int j = 2; j <= n; j += 2) {
//			  System.out.printf("%d^2 = %d\n", j, j*j);
//		    }
//		scanner.close();
//	}
//}
//	