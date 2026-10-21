package softuni;
import java.util.Scanner;

public class logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int smicrobus = 0; int skamion = 0; int svlak = 0;
        double totalprice = 0;
        int totaltons = 0;
        for(int i = 0; i<n; i++) {
        	int x = scanner.nextInt();
        	totaltons += x;
        	if(x<=3) {
        		smicrobus+=x;
        	}else if(x>3 && x<=11) {
        		skamion+=x;
        	}else if(x>11) {
        		svlak+=x;
        	}
        }
        totalprice = (smicrobus*200) + (skamion*175) + (svlak*120);
        double avgprice = totalprice/totaltons;
        double percentbus = (smicrobus*100.0)/totaltons;
        double percenttruck = (skamion*100.0)/totaltons;
        double percenttrain = (svlak*100.0)/totaltons;
                
        System.out.printf("Price per ton: %.2f\n", avgprice);
        System.out.printf("With a microbus: %.2f%%\n", percentbus);
        System.out.printf("With a truck: %.2f%%\n", percenttruck);
        System.out.printf("With a train: %.2f%%\n", percenttrain);
        scanner.close();
    }
}
//5
//2
//10
//20
//1
//7