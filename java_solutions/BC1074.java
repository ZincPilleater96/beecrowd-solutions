package pck;

import java.util.Scanner;

public class BC1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i]= scanner.nextInt();
        	if(arr[i]>0 && arr[i]%2!=0) {
        		System.out.println("ODD POSITIVE");

        	}else if(arr[i]<0 && arr[i]%2!=0){
        		System.out.println("ODD NEGATIVE");
        	}
        	else if(arr[i] == 0) {
        		System.out.println("NULL");
        	}else if(arr[i]<0 && arr[i]%2==0){
        		System.out.println("EVEN NEGATIVE");
        	}
        	else if(arr[i]>0 && arr[i]%2==0){
        		System.out.println("EVEN POSITIVE");
        	}
        }
        	
        scanner.close();
    }
}
