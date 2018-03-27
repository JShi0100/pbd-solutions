import java.util.Scanner;

public class CountingWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type in a message and I'll display it as many times as you want.");
        System.out.println("MESSAGE: ");
        String message = keyboard.next();
        
        System.out.println("How many times should I display it?");
        int number = keyboard.nextInt();
        
        int n = 0;
        while (n < number) {
        System.out.println((n+1) + ". " + message);
        n++;
       }
   }
}
