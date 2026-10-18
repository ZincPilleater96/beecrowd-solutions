package pck;
import java.util.Scanner;

public class BC1080_whileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int max = -1;
        int maxpos = 0;
        int i = 1;
        while (i <= 100) {
            int current = scanner.nextInt();
            
            if (current > max) {
                max = current;
                maxpos = i;
            }
            
            i++;
        }
        
        System.out.println(max);
        System.out.println(maxpos);
        
        scanner.close();
    }
}