package pck;
import java.util.Scanner;

public class BC1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        float media = (n1 * 2.0f + n2 * 3.0f + n3 * 4.0f + n4 * 1.0f) / 10.0f;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            float examScore = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", examScore);

            float finalMedia = (media + examScore) / 2.0f;
            if (finalMedia >= 5.0f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", finalMedia);
        }

        scanner.close();
    }
}