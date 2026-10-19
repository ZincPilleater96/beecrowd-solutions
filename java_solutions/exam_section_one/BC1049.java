package pck;
import java.util.Scanner;
public class BC1049 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String animal = scanner.nextLine();
		String type = scanner.nextLine();
		String eatingtype = scanner.nextLine();
		String result = null;
		switch (animal) {
		case "vertebrado":
			switch(type) {
			case "ave":
				switch(eatingtype) {
				case "carnivoro":
					result = "aguia";
					break;
				case "onivoro":
					result = "pomba";
					break;
				}
				break;
			case "mamifero":
				switch(eatingtype) {
				case "onivoro":
					result = "homem";
					break;
				case "herbivoro":
					result = "vaca";
					break;
				}
				break;
			}
			break;
		case "invertebrado":
			switch(type) {
			case "inseto":
				switch(eatingtype) {
				case "hematofago":
					result = "pulga";
					break;
				case "herbivoro":
					result = "lagarta";
					break;
				}
				break;
			case "anelideo":
				switch(eatingtype) {
				case "hematofago":
					result = "sanguessuga";
					break;
				case "onivoro":
					result = "minhoca";
					break;
		}
				break;
				
				}
			break;
			}
		System.out.println(result);
		scanner.close();
	}
}