package pck;
import java.util.Scanner;

public class BC1072_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int countin = 0;
        int countout = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                countin++;
            } else {
                countout++;
            }
        }
        
        System.out.println(countin + " in");
        System.out.println(countout + " out");
        
        scanner.close();
    }
}