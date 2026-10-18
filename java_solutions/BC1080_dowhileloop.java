package pck;
import java.util.Scanner;
public class BC1080_dowhileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int max = -1;
        int maxpos = 0;
        int i = 1; //start pos
        do {
            int current = scanner.nextInt();
            
            if (current > max) {
                max = current;
                maxpos = i;
            }
            
            i++;
        } while (i <= 100);
        
        System.out.println(max);
        System.out.println(maxpos);
        
        scanner.close();
    }
}