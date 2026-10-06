package pck;

import java.util.Scanner;

public class BC1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            float x = scanner.nextFloat();
            float y = scanner.nextFloat();

            if (x == 0.0f && y == 0.0f) {
                System.out.println("Origem");
            } else if (x == 0.0f) {
                System.out.println("Eixo Y");
            } else if (y == 0.0f) {
                System.out.println("Eixo X");
            } else if (x > 0.0f && y > 0.0f) {
                System.out.println("Q1");
            } else if (x < 0.0f && y > 0.0f) {
                System.out.println("Q2");
            } else if (x < 0.0f && y < 0.0f) {
                System.out.println("Q3");
            } else if (x > 0.0f && y < 0.0f) {
                System.out.println("Q4");
            }

        scanner.close();
    }
}