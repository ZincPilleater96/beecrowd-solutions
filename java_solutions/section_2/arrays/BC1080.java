package arrays;
import java.util.Scanner;
public class BC1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int pmax = 0;
        int[] arr = new int[100];
        for(int i = 0; i<100; i++) {
        	arr[i] = scanner.nextInt();
        	if(arr[i]>max) {
        		max = arr[i];
        		pmax = i+1;
        	}
        }
        System.out.println(max);
        System.out.println(pmax);
        scanner.close();
    }
}
		
				
	
