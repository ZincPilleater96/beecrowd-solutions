package pck;

public class BC1095 {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            System.out.println("I=" + i + " J=" + j);
            i += 3;
        }
    }
}
//public class BC1095 {
//    public static void main(String[] args){
//    	int numj = 60;
//    	int numi= 1;
//    	while (numj >= 0) {
//            System.out.println("I=" + numi + " J=" + numj);
//            numi += 3;
//            numj -= 5;
//    	}
//    }
//}

