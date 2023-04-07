package com.company;

import java.util.Scanner;

public class Menu {

    public void menu() {
        NumberGame ng = new NumberGame();
        LetterGame lg = new LetterGame();
        Scanner a = new Scanner(System.in);
                // First Menu Appears when you run the code.

        System.out.println("MENU");
        System.out.println(".......");
        System.out.println("1-Number Guess");
        System.out.println("2-Letter Guess");
        System.out.println("3-Highest Scores");
        System.out.println("4-Credits");
        System.out.println("5-Exit");
        System.out.println(".......");
        System.out.print("Your Choice -> ");
        int choice = a.nextInt();
    // using switch for selecting Number game Levels

        switch (choice) {
            case 1:
                ng.game();
                break;
            case 2:
                lg.game();
                break;
            case 3:
                if(NumberGame.getHighestScore()!=100)
                    System.out.println("\"Number Guess\" Best Score: "+ NumberGame.getHighestScore()+" chances used up.");
                else
                    System.out.println("\"Number Guess\" has not played yet.");

                if(LetterGame.getHighestScore()!=100)
                    System.out.println("\"Letter Guess\" Best Score: "+ LetterGame.getHighestScore()+" chances used up.");
                else
                    System.out.println("\"Letter Guess\" has not played yet.");
                menu();
                break;
            case 4: // Credits
                System.out.println("Group Member's name and IDs");
                menu();
                break;
            case 5: // Exit the game.
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                menu();
                break;
        }
    }
}
