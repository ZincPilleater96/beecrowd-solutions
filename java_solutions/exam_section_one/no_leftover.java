package pck;
import java.util.Scanner;

public class no_leftover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evencount = 0;
        int threecount = 0;
        int fourcount = 0;
        double p1=0;
        double p2=0;
        double p3=0;
        for(int i = 0; i<n; i++) {
        	int x = scanner.nextInt();
        	if(x%2==0) {
        		evencount++;
        	}
        	if(x%3==0) {
        		threecount++;
        	}
        	if(x%4==0) {
        		fourcount++;
        	}
        }
        p1 = (evencount*100)/n;
        p2 = (threecount*100)/n;
        p3 = (fourcount*100)/n;
        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);    
        scanner.close();
    }
}
//10
//680
//2
//600
//200
//800
//799
//199
//46
//128
//65