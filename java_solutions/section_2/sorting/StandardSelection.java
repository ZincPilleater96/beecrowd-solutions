package sorting;
import java.util.Scanner;

public class StandardSelection {
    public static Scanner scanner = new Scanner(System.in);
//---------------------------------------------------
    public static void selectionSort(int[] arr, int n) {
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
        printArray(arr);
    }
//---------------------------------------------------
    public static void readArray() {
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        selectionSort(numbers, n);
    }
//---------------------------------------------------
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
//---------------------------------------------------
    public static void main(String[] args) {
        readArray(); 
    }
}
//---------------------------------------------------
//64 25 12 22 11
//11 12 22 25 64
