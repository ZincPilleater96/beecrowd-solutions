package section_2;
import java.util.Scanner;
import java.util.Random;
public class cowsandbulls {
	public static int randomnum() {
	    Random rnd = new Random();
	    int num = rnd.nextInt(9) + 1;
	    for (int i = 0; i < 3; i++) {
	        int nextdigit;
	        boolean checkdupe;
	        do {
	            nextdigit = rnd.nextInt(9) + 1;
	            checkdupe = false;
	            int temp = num;
	            while (temp > 0) {
	                int currentDigit = temp % 10;
	                if (currentDigit == nextdigit) {
	                    checkdupe = true;
	                    break;
	                }
	                temp = temp / 10;
	            }
	        } while (checkdupe);
	        
	        num = num * 10 + nextdigit;
	    }
	    return num;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = randomnum();
		System.out.println(x);
		int attempts = 0;
		int cx1 = (x / 1000) % 10; 
		int cx2  = (x / 100) % 10;
		int cx3 = (x / 10) % 10;
		int cx4 = x % 10;
		boolean isCorrectY = false;
		while (isCorrectY == false && attempts < 20) {
			attempts++;
			int y = scanner.nextInt();
			int cy1 = (y / 1000) % 10;
            int cy2 = (y / 100) % 10;
            int cy3 = (y / 10) % 10;
            int cy4 = y % 10;
            
            int bulls = 0;
            int cows = 0;
            
            if (cx1 == cy1) bulls++;
            if (cx2 == cy2) bulls++;
            if (cx3 == cy3) bulls++;
            if (cx4 == cy4) bulls++;
            
            if (cy1 == cx2 || cy1 == cx3 || cy1 == cx4) cows++;
            if (cy2 == cx1 ||cy2 == cx3 || cy2 == cx4) cows++;
            if (cy3 == cx1 ||  cy3 == cx2 || cy3 == cx4) cows++;
            if (cy4 == cx1 || cy4 ==cy2 || cy4 == cy3) cows++;
            System.out.println("bulls: " + bulls + ", cows: " + cows);
            
            if (bulls == 4) {
                isCorrectY = true;
            }
		}
		if (isCorrectY) {
            System.out.println("num " + x + "found with " + attempts + "attempts");
		}else {
			System.out.println("no");
		}
		
		
		scanner.close();
	}

}
