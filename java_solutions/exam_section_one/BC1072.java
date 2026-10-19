package pck;

import java.util.Scanner;

public class BC1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countin = 0, countout = 0;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i]= scanner.nextInt();
        	if(arr[i]>=10 && arr[i]<=20) {
        		countin++;
        	}else{
        		countout++; // countout = n-countin
        	}
        }
        System.out.println(countin + " in");
        System.out.println(countout + " out");
        	
        scanner.close();
    }
}