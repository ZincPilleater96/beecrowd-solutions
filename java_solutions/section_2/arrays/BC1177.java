package arrays;
import java.util.Scanner;
public class BC1177 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[1000];
        for(int i=0; i<1000; i++) {
        	arr[i] = i % t;
        	System.out.printf("N[%d] = %d\n", i, arr[i] );
        	}
        scanner.close();  
	}
}
      	
        