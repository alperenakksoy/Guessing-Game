package com.company;

import java.util.Scanner;

public class NumberGame{
    public static int highestScore = 100;


    public void game() {
        Menu goBackToMenu = new Menu();
        Scanner a = new Scanner(System.in);

        // Number game menu for selectin difficult levels
        System.out.println("Select the difficulty.");
        System.out.println(".......");
        System.out.println("1-Easy");
        System.out.println("2-Medium");
        System.out.println("3-Hard");
        System.out.println("4-Go back");
        System.out.println(".......");
        System.out.print("Your Choice -> ");

        int choice = a.nextInt();
        // using switch case for seleting levels, and their game rules also printing informations.
        switch (choice) {
            case 1: // for number game - Easy level informations and game.
                easyNumber();
                game();
                break;
            case 2: // for number game - Medium level informations and game.
                mediumNumber();
                game();
                break;
            case 3: // for number game - Hard level informations and game.
                hardNumber();
                game();
                break;
            case 4: // for going back to menu.
                goBackToMenu.menu();
                break;
            default: // invalid selection error.
                System.out.println("Invalid option. Please try again.");
                game();
                break;
        }
    }

    public void easyNumber() { // Number game Easy level section
        
        int totalChances = 5;
        int minNumber = 1;
        int maxNumber = 15;
        
        // Informations of Easy level section
        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the number between the range of 1 to 15.");
        System.out.println("2-You have total of 5 chances.");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        Scanner a = new Scanner(System.in);
        // Guessing Input Section.

        int number = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int guess;
        int numberOfGuesses = 0;
        for (int i = 0; i < totalChances; i++) {
            System.out.println("Guess the number: ");
            guess = a.nextInt();
            numberOfGuesses++;

            if (guess == number) {
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else if (guess < number)
                System.out.println("Your guess is too low.. (You have " + (totalChances - i - 1) + " guesses left.)");

            else
                System.out.println("Your guess is too much.. (You have " + (totalChances - i - 1) + " guesses left.)");
        }
    }

    public void mediumNumber(){ // Number game - Medium Level section.
        int totalChances = 4;
        int minNumber = 1;
        int maxNumber = 20;

        // Informations of Medium Level Section
        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the number between the range of 1 to 20.");
        System.out.println("2-You have total of 4 chances. ");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        Scanner a = new Scanner(System.in);

        // Guessing Input Section
        int number = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int guess;
        int numberOfGuesses = 0;

        for(int i = 0; i<totalChances; i++){
            System.out.println("Guess the number: ");
            guess = a.nextInt();

            if(guess==number){
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else if(guess<number)
                System.out.println("Your guess is too low.. (You have "+(totalChances-i-1)+" guesses left.)");

            else
                System.out.println("Your guess is too much..(You have "+(totalChances-i-1)+" guesses left.)");
        }
    }

    public void hardNumber(){ // Number game Hard Level section.

        int totalChances = 3;
        int minNumber = 1;
        int maxNumber = 40;
        // Information of Hard level section

        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the number between the range of 1 to 40.");
        System.out.println("2-You have total of 3 chances. ");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        Scanner a = new Scanner(System.in);

        // Guessing Input Section.

        int number = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int guess;
        int numberOfGuesses = 0;

        for(int i = 0; i<totalChances; i++){
            System.out.println("Guess the number: ");
            guess = a.nextInt();

            if(guess==number){
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else
                System.out.println("This ain't it! (You have "+(totalChances-i-1)+" guesses left.)");
        }
    }

    public static int getHighestScore(){ // High Score section
        return highestScore;
    }
}
