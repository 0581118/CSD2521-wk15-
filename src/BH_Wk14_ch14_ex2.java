// New comment

import java.util.Scanner;

/**
 * Braden Henry
 * Date: 11/19/2024
 * Desc: Display and play hangman
 */

public class BH_Wk14_ch14_ex2 {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}