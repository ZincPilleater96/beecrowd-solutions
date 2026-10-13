package pck;

import java.util.Scanner;

public class BC1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        
        if (s % 2 == 0) {
            s++;
        }        
        for (int i = 0; i < 6; i++) {
            System.out.println(s);
            s += 2;
        }
        
        scanner.close();
    }
}