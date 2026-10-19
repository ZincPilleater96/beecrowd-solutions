package pck;

import java.util.Scanner;

public class BC1075_whileloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int i = 1;
        while (i <= 10000) {
            if (i % n == 2) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}