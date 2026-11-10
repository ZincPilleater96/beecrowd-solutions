package sorting;
import java.util.Scanner;

public class SSMainMethod {    
    public static Scanner scanner = new Scanner(System.in);
//---------------------------------------------------
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxp = 0; 
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[maxp]) {
                    maxp = j;
                }
            }
            int lastindex = n - 1 - i;
            if (maxp != lastindex) {
                int temp = arr[lastindex];
                arr[lastindex] = arr[maxp];
                arr[maxp] = temp;
            }
        }
    }
//---------------------------------------------------
    public static int[] readArray() {
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
//---------------------------------------------------
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
//---------------------------------------------------
    public static void main(String[] args) {
        int[] numbers = readArray();
        selectionSort(numbers);
        printArray(numbers);
    }
}
//---------------------------------------------------
//64 25 12 22 11
//11 12 22 25 64