package section_2;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class BC1104 {
	public static Scanner scanner = new Scanner(System.in);
	
    public static int[] a;
    public static int[] b;
    public static int n, m;
    final static int MAX_VALUE = 100005;
//---------------------------------------------------
    public static void ReadArray() {    	 
        a = new int[n];
        b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
    }
//---------------------------------------------------
    public static void DeleteDupe() {   	 
        Arrays.sort(a);
        Arrays.sort(b);
        int i, counterA = 0, counterB = 0;
 
        for (i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                a[i - 1] = MAX_VALUE;
                counterA++;
            }
        } 
        Arrays.sort(a);
        n = n - counterA;
//-----------------------------------//               
        for (i = 1; i < m; i++) {
            if (b[i] == b[i - 1]) {
                b[i - 1] = MAX_VALUE;
                counterB++;
            }
        }
        Arrays.sort(b);
        m = m - counterB;
    }   
//---------------------------------------------------
    public static int CountSame() { 
        int i, j, same = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    same++;
                    break;
                }
            }
        }
        return same;
    }
//---------------------------------------------------
    public static int FindAnswer(int common) { 
        int differentA = n - common;
        int differentB = m - common;
        
        return Math.min(differentA, differentB);
    }
//---------------------------------------------------
    public static void main(String[] args) {
        n = scanner.nextInt();
        m = scanner.nextInt();
 
        while (n != 0 || m != 0) {
            ReadArray();
            DeleteDupe();
            int common = CountSame();
            System.out.println(FindAnswer(common));
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
    }
}
//---------------------------------------------------
 
//1 1
//1000
//1000
// - 0

//3 4
//1 3 5
//2 4 6 8
// - 3

//10 9
//1 1 2 3 5 7 7 8 9 15
//2 2 2 3 4 6 10 11 11
// - 4

//0 0