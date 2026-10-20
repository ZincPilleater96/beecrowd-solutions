package pck;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for(int i = 1; i<=n; i++) {
        	if(i%3==0 && untreated>treated) {
        		doctors++;
        	}
        	int x = scanner.nextInt();
        	if (x <= doctors) {
                treated += x;
            } else {
                treated += doctors;
                untreated += x - doctors;
            }
        }
        System.out.println("Treated patients: " + treated);
        System.out.println("Untreated patients: " + untreated);
        
        scanner.close();
    }
}

//4
//7
//27
//9
//1