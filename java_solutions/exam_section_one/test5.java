package pck;
public class test5 {
	public static void main(String[] args) {
		for(double i = 0.0; i<=2.0; i+=0.2) {
			for(double j = 1; j<=3; j++) {
				if(Math.abs(i - Math.round(i)) < 0.0001) {
					System.out.printf("I=%.0f J=%.0f\n", i, j+i);
				}else {
					System.out.printf("I=%.1f J=%.1f\n", i, j+i);
				}
			}
		}
	}
}