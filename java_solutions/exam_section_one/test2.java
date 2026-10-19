package pck;
public class test2 {
	public static void main(String[] args){
		int j = 7;
		for(int i = 1; i<=9; i+=2) {
			while(j>=i+4) {
			System.out.printf("I=%d J=%d\n", i, j);
			j--;
			}
			j+=5;
			
		}
	}
}