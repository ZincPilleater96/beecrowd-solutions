package pck;
import java.util.Scanner;
public class BC1080_forloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int[] arr = new int[100];
            int max = 0;
            int maxpos = 0;
            for (int i = 0; i < 100; i++) {
                arr[i] = scanner.nextInt();                
                if(max<arr[i]) {
                	max = arr[i];
                	maxpos = i+1; //not array logic
                }
            }
            System.out.println(max);
            System.out.println(maxpos);
            scanner.close();
        }
    }
