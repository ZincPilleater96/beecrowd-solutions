package softuni;

import java.util.Scanner;
import java.lang.Math;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int doctors = 7, treated = 0, untreated = 0, patientsForDay;
        int n = scan.nextInt();
        for (int i = 1; i<=n; i++) {
            patientsForDay = scan.nextInt();
            if ( i%3 == 0 && untreated > treated)
                doctors++;
            treated += Math.min(patientsForDay, doctors);
            untreated += Math.max(patientsForDay - doctors, 0);
        }

        System.out.printf("Treated patients: %d.\n", treated );
        System.out.printf("Untreated patients: %d.\n", untreated );
        scan.close();
    }
}
//public class Hospital {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int treated = 0;
//        int untreated = 0;
//        int doctors = 7;
//        for(int i = 1; i<=n; i++) {
//        	if(i%3==0 && untreated>treated) {
//        		doctors++;
//        	}
//        	int x = scanner.nextInt();
//        	if (x <= doctors) {
//                treated += x;
//            } else {
//                treated += doctors;
//                untreated += x - doctors;
//            }
//        }
//        System.out.println("Treated patients: " + treated);
//        System.out.println("Untreated patients: " + untreated);
//        
//        scanner.close();
//    }
//}

//4
//7
//27
//9
//1