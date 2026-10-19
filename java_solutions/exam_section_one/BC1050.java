package pck;
import java.util.Scanner;

public class BC1050 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int num = scanner.nextInt();
    	String city = null;
    	switch(num) {
    	case 61:
    		city = "Brasilia";
    		break;
    	case 71:
    		city = "Salvador";
    		break;
    	case 11:
    		city = "Sao Paulo";
    		break;
    	case 21:
    		city = "Rio de Janeiro";
    		break;
    	case 32:
    		city = "Juiz de Fora";
    		break;
    	case 19:
    		city = "Campinas";
    		break;
    	case 27:
    		city = "Vitoria";
    		break;
    	case 31:
    		city = "Belo Horizonte";
    		break;
    		default:
    			city = "DDD nao cadastrado";
    	}
    	System.out.println(city);
    	scanner.close();
    }
}
   
    
    		
    		
    		
    	




//public class BC1050 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//            int ddd = scanner.nextInt();  
//            
//            String destination = switch (ddd) {
//                case 61 -> "Brasilia";
//                case 71 -> "Salvador";
//                case 11 -> "Sao Paulo";
//                case 21 -> "Rio de Janeiro";
//                case 32 -> "Juiz de Fora";
//                case 19 -> "Campinas";
//                case 27 -> "Vitoria";
//                case 31 -> "Belo Horizonte";
//                default -> "DDD nao cadastrado";
//            };
//            
//            System.out.println(destination);
//            scanner.close();
//        }
//    }
