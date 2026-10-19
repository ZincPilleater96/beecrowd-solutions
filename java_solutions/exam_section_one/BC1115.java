package pck;
import java.util.Scanner;
public class BC1115 {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		int a = scanner.nextInt();
        	int b = scanner.nextInt();
        	String quadrant = null;
        	if (a == 0 || b == 0) {
                break;
        	}
        	if(a>0 && b>0) {
        		quadrant = "primeiro";
            }else if(a>0 && b<0) {
        		quadrant = "quarto";
            }else if(a<0 && b<0) {
        		quadrant = "terceiro";
            }else if(a<0 && b>0) {
        		quadrant = "segundo";
            }
        	System.out.print(quadrant);
        	System.out.println();
    	}    	
        scanner.close();

    }
}

