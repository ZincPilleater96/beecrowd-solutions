package pck;
public class BC1095 {
    public static void main(String[] args){
    	int numj = 60;
    	int numi= 1;
    	while (numj >= 0) {
            System.out.println("I=" + numi + " J=" + numj);
            numi += 3;
            numj -= 5;
    	}
    }
}

