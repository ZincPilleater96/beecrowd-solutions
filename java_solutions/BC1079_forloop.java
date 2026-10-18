package pck;
import java.util.Scanner;
public class BC1079_forloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            
            for (int i = 0; i < n; i++) {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                
                double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
                
                System.out.printf("%.1f\n", average);
            }
            scanner.close();
        }
    }
