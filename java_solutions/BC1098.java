package pck;
public class BC1098 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2.05; i += 0.2) {
            for (double j = 1; j <= 3; j++) {

                if (Math.abs(i - Math.round(i)) < 0.0001) {
                    System.out.printf("I=%.0f J=%.0f\n", i, i+j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, i+j);
                }
            }
        }
    }
}
//public class BC1098 {
//    public static void main(String[] args){
//    	double i = 0.0f;
//    	while(i<=2.0) {
//    		double j = 1.0;
//    		while(j<=3) {
//    			if (Math.abs(i - Math.round(i)) < 0.0001) {
//                    System.out.printf("I=%d J=%d\n", (int) Math.round(i), (int) Math.round(i + j));
//                } else {
//                    System.out.printf("I=%.1f J=%.1f\n", i, i + j);
//                }
//    			j += 1.0;
//    		}
//    		i += 0.2;
//    	}
//    	
//    	}
//    }

