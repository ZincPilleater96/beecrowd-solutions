package sorting;
import java.util.Scanner;
import java.util.Arrays;

public class BC1104 {

    public static Scanner scanner = new Scanner(System.in);
    static final int MAXVALUE = 100005;
//---------------------------------------------------
    public static int removeDupes(int[] arr, int size) {
        if (size == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int uniqueCount = size;
        for (int i = 0; i < uniqueCount; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < uniqueCount - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    uniqueCount--;
                    j--; 
                }
            }
        }
        return uniqueCount; //fail
    }
//---------------------------------------------------
    public static int Trade(int[] a, int n, int[] b, int m) {
        n = removeDupes(a, n);
        m = removeDupes(b, m);

        int same = 0;
        for(int i = 0; i<n; i++) {
        	for(int j = 0; j<m; j++) {
        		if (a[i] == b[j]) {
                    same++;
        		}
        	}
        }

        int countA = n - same;
        int countB = m - same;

        if (countA < countB) {
            return countA;
        } else {
            return countB;
        }
    }
//---------------------------------------------------
    public static void ReadData() {
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }

            int result = Trade(a, n, b, m);
            System.out.println(result);
        }
    }
//---------------------------------------------------

    public static void main(String[] args) {
        ReadData();
    }

}