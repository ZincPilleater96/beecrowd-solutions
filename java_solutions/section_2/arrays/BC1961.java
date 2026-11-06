package arrays;
import java.util.Scanner;
public class BC1961 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt(); 
        boolean CanJump = true;    
        int[] pipes = new int[n];
        for(int i = 0; i<n; i++) {
        	pipes[i]=scanner.nextInt();
        	
        	if(i>0) {
        		int pipesabs = Math.abs(pipes[i] - pipes[i-1]);
        		if (pipesabs>p) {
            		CanJump = false;
            	}
        	}
        }
        if(CanJump) {
    		System.out.println("YOU WIN");
    	}else {
    		System.out.println("GAME OVER");
    	}
        
        scanner.close();
    }
}
//5 10
//1 3 6 9 7 2 4 5 8 3 