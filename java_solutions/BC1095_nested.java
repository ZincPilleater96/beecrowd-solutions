package pck;
public class BC1095_nested {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 60; j >= 0; j -= 5) {
            for (int k = 0; k < 1; k++) {
                System.out.println("I=" + i + " J=" + j);
            }
            
            i += 3;
        }
    }
}