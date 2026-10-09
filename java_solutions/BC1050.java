package pck;

import java.util.Arrays;
import java.util.Scanner;

public class BC1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] sorted = {a, b, c};
        Arrays.sort(sorted);

        for (int i = 0; i < 3; i++) {
            System.out.println(sorted[i]);
        }

        System.out.println();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scanner.close();
    }
}