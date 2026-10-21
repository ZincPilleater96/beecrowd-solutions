package softuni;
import java.util.Scanner;

public class histograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = 0,p2 = 0,p3 = 0,p4 = 0,p5 =0;
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++) {
        	int x = scanner.nextInt();
        	if(x<200) {
        		p1++;
        	}else if(x>=200 && x<400) {
        		p2++;
        	}else if(x>=400 && x<600) {
        		p3++;
        	}else if(x>=600 && x<800) {
        		p4++;
        	}else if(x>=800) {
        		p5++;
        	}
    }
        double percentp1 = (p1 * 100.0) / n;
        double percentp2 = (p2 * 100.0) / n;
        double percentp3 = (p3 * 100.0) / n;
        double percentp4 = (p4 * 100.0) / n;
        double percentp5 = (p5 * 100.0) / n;
    	System.out.printf("%.2f%%\n", percentp1);
    	System.out.printf("%.2f%%\n", percentp2);
    	System.out.printf("%.2f%%\n", percentp3);
    	System.out.printf("%.2f%%\n", percentp4);
    	System.out.printf("%.2f%%\n", percentp5);
    	
    scanner.close();
}
}
//    3
//    1
//    2
//    999