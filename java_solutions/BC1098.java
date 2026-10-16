package pck;
public class BC1098 {
    public static void main(String[] args) {
        for (double i = 0.0f; i <= 2.0f; i+=0.1f) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("I= %.1f\n", i);
                System.out.print(" J=" + j);
            }
        }
    }
}