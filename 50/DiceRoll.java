import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Roll until you get the same number twice.");
        System.out.println("Your rolls are...");
        
        int roll1 = 1 + r.nextInt(6);
        int roll2 = 1 + r.nextInt(6);
        
        while (roll1 != roll2) {
        System.out.println("Roll1 = " + roll1 );
        System.out.println("Roll2 = " + roll2 );
        System.out.println("Your total is " + (roll1 + roll2));
        System.out.println("Press 'r' to roll again.");
        input.next();
        roll1 = 1 + r.nextInt(6);
        roll2 = 1 + r.nextInt(6);
        }
        
        System.out.println("Roll1 = " + roll1 );
        System.out.println("Roll2 = " + roll2 );
        System.out.println("Congratulations! You have won the game.");
        System.out.println("    GGGGG    AAAAA  MM     MM  EEEEE             OOO   V    V EEEEE   RRR  ");
        System.out.println("   G     G   A   A  MMM   MMM  E                O   O  V    V E      R   R ");
        System.out.println("   G         A   A  M  MMM  M  E                O   O  V    V E      R   R ");
        System.out.println("   G         AAAAA  M   M   M  EEEE             O   O  V    V EEEE   RRRRR ");
        System.out.println("   G   GGG   A   A  M       M  E                O   O  V    V E      RR    ");
        System.out.println("   GG   GG   A   A  M       M  E                O   O   V  V  E      R R   ");
        System.out.println("    GGGGG    A   A  M       M  EEEEEE            OOO     VV   EEEEE  R  R  ");
     }
}
