package pck;

import java.util.Scanner;

public class BC1074_simple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else {
                if (x % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }
                if (x > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
        scan.close();
    }
}