package beecrowd;
import java.util.Scanner;

public class bc1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int minutes = distance * 2;
        System.out.println(minutes + " minutos");
        scanner.close();
    }
}
