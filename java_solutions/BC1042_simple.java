package pck;

import java.util.Scanner;

public class BC1042_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b + "\n" + c);
            } else {
                System.out.println(c + "\n" + b);
            }
        } 
        else if (b <= a && b <= c) {
            System.out.println(b);
            if (a <= c) {
                System.out.println(a + "\n" + c);
            } else {
                System.out.println(c + "\n" + a);
            }
        } 
        else { 
            System.out.println(c);
            if (a <= b) {
                System.out.println(a + "\n" + b);
            } else {
                System.out.println(b + "\n" + a);
            }
        }

        System.out.println(); 
        System.out.println(a + "\n" + b + "\n" + c);
        
        scanner.close();
    }
}