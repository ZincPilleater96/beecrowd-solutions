package beecrowd;
import java.util.Scanner;

public class BC1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String name;
        double salary, bonusearned, bonussalary;
        name = scanner.nextLine();
        salary = scanner.nextDouble();
        bonusearned = scanner.nextDouble();
        bonussalary = salary + (bonusearned*0.15);
        System.out.printf("TOTAL = R$ %.2f\n", bonussalary);
        scanner.close();        
    }
}
