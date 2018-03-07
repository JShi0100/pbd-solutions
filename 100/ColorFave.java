import java.util.Scanner;

public class ColorFave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("IT'S QUIZ TIME!!");
        System.out.println("Answer these questions, and I will guess your favourite color");
        System.out.print("What is your name? ");
            String name = input.next();
        System.out.print("Hello, " + name + ", what color is your hair? ");
            String hair = input.next();
        if (hair.equals ("brown") || hair.equals ("brunette")) {
            System.out.println("Your favourite color is blue!");
        } if (hair.equals ("blonde")) {
            System.out.println("Your favourite color is green!!");
        } if (hair.equals ("black")) {
            System.out.println("Your favourite color is whatever Shaweon's favourite color is!!");
        } else {
            System.out.println("YOU DONT HAVE A FAVOURITE COLOR!!");
        }
     }
}
