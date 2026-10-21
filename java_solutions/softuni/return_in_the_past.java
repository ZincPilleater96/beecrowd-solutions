						package softuni;
import java.util.Scanner;

public class return_in_the_past {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double willmoney = scanner.nextDouble();
        int yeartolive = scanner.nextInt();
        for(int i = 1800; i<=yeartolive; i++) {
        	if(i%2==0) {
        		willmoney-=12000;
        	}else{
        		willmoney-=(12000+((i-1800+18)*50));
        	}
        }
        if(willmoney>0) {
        	System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", willmoney);
        }else {
        	System.out.printf("He will need %.2f dollars to survive.", Math.abs(willmoney));        	        	
        }
        
        scanner.close();
    }
}
//50000
//1802