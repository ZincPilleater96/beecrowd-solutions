package arrays;
import java.util.Scanner;
public class BC1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int pmin = Integer.MAX_VALUE;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = scanner.nextInt();
        	if(arr[i]<min) {
        		min = arr[i];
        		pmin = i;
        	}
        }
        System.out.printf("Menor valor: %d\n", min);
        System.out.printf("Posicao: %d\n", pmin);
        scanner.close();
    }
}
		
				
	
