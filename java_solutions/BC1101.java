package pck;
import java.util.Scanner;
public class BC1101 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	int sum = 0;
        	int min = Math.min(a, b);
        	int max = Math.max(a, b);
        	if (a <= 0 || b <= 0) {
                break;
        	}
        	while(min<=max) {
        		System.out.print(min + " ");
        		sum+=min;
        		min++;
            }
        	System.out.print("Sum=" + sum);
        	System.out.println();
    	}    	
        scanner.close();

    }
}

