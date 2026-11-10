package arrays;
import java.util.Scanner;

public class BC2221 {
    public static Scanner scanner = new Scanner(System.in);
//---------------------------------------------------
    public static int calculateValue(int attack, int defense, int level, int bonus) {
        int value = (attack + defense) / 2;
        if (level % 2 == 0) {
            value += bonus;
        }
        return value;
    }
//---------------------------------------------------
    public static String findWinner(int dabValue, int guaValue) {
        if (dabValue > guaValue) {
            return "Dabriel";
        } else if (guaValue > dabValue) {
            return "Guarte";
        } else {
            return "Empate";
        }
    }
//---------------------------------------------------
    public static void processSingleBattle(int bonus) {
        int dabA = scanner.nextInt();
        int dabD = scanner.nextInt();
        int dabL = scanner.nextInt();
        
        int guaA = scanner.nextInt();
        int guaD = scanner.nextInt();
        int guaL = scanner.nextInt();
        
        int dabValue = calculateValue(dabA, dabD, dabL, bonus);
        int guaValue = calculateValue(guaA, guaD, guaL, bonus);
        
        System.out.println(findWinner(dabValue, guaValue));
    }
//---------------------------------------------------
    public static void runAllBattles() {
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int bonus = scanner.nextInt();
            processSingleBattle(bonus);
        }
    }
//---------------------------------------------------
    public static void main(String[] args) {
        runAllBattles();
    }
}
//---------------------------------------------------
// 3
// 5
// 12 23 15
// 42 12 20
// 2
// 52 1 11
// 1 52 1
// 3
// 95 12 22
// 5 51 21

// Guarte
// Empate
// Dabriel