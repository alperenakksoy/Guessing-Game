package com.company;

import java.util.Scanner;

public class LetterGame {
    public static int highestScore = 100;


    public void game(){
        Menu goBackToMenu = new Menu();
        Scanner a = new Scanner(System.in);

                // Letter game menu for selectin difficult levels

        System.out.println("Select the difficulty.");
        System.out.println(".......");
        System.out.println("1-Easy");
        System.out.println("2-Medium");
        System.out.println("3-Hard");
        System.out.println("4-Go back");
        System.out.println(".......");
        System.out.print("Your Choice -> ");

        int choice = a.nextInt();
        switch (choice){         // using switch case for seleting levels, and their game rules also printing informations.

            case 1:
                easyLetter(); // for Letter game - Easy level informations and game.
                game();
                break;
            case 2: // for letter game - Medium level informations and game.
                mediumLetter();
                game();
                break;
            case 3: // for letter game - Hard level informations and game.
                hardLetter();
                game();
                break;
            case 4: // for going back to menu
                goBackToMenu.menu();
                break;
            default: // invalid selection error.
                System.out.println("Invalid option. Please try again.");
                game();
                break;
        }
    }

    public void easyLetter(){
        int totalChances = 2;
        int index = 0;
        String[] vowels = {"a", "e", "i", "o", "u", "y"}; // vowels arrays for easy level
        Scanner sc = new Scanner(System.in);

                // Informations of Easy level section

        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the vowel letter.");
        System.out.println("2-You have total of 2 chances. ");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        int secretIndex = (int) (Math.random() * vowels.length);
        String secretVowel = vowels[secretIndex];
        String guess;
        int numberOfGuesses = 0;

        for(int i=0; i<totalChances; i++){         // Guessing Input Section.

            System.out.println("Guess the letter: ");
            guess = sc.nextLine().toLowerCase();
            numberOfGuesses++;

            for(int j=0; j<vowels.length; j++){
                //this "for loop" is to find the index of the scanned letter, so we can compare its placement with the secret letter
                if(guess.equals(vowels[j]))
                    index = j;
            }

            if(guess.equals(secretVowel)){
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else if(index < secretIndex)
                System.out.println("Your guess is too low! (You have "+(2-numberOfGuesses)+" guesses left.)");
            else
                System.out.println("Your guess is too much! (You have "+(2-numberOfGuesses)+" guesses left.)");
        }
    }

    public void mediumLetter(){ // Number game - Medium Level section.
        int totalChances = 4;
        int index=0;
        String[] consonant = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};  // consonant array for medium level
        Scanner sc = new Scanner(System.in);

                // Informations of Medium Level Section

        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the consonant letter.");
        System.out.println("2-You have total of 4 chances. ");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        int secretIndex = (int) (Math.random() * consonant.length);
        String secretVowel = consonant[secretIndex];
        String guess;
        int numberOfGuesses = 0;

        for(int i=0; i<totalChances; i++){ // Guessing Input Section.
            System.out.println("Guess the letter: ");
            guess = sc.nextLine().toLowerCase();
            numberOfGuesses++;

            for(int j=0; j<consonant.length; j++){
                //this "for loop" is to find the index of the scanned letter, so we can compare its placement with the secret letter
                if(guess.equals(consonant[j]))
                    index = j;
            }

            if(guess.equals(secretVowel)){
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else if(index < secretIndex)
                System.out.println("Your guess is too low! (You have "+(totalChances-numberOfGuesses)+" guesses left.)");
            else
                System.out.println("Your guess is too much! (You have "+(totalChances-numberOfGuesses)+" guesses left.)");
        }
    }

    public void hardLetter(){
        int totalChances = 5;
        int index=0;
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; // All letters for hard level
        Scanner sc = new Scanner(System.in);
 
                        // Informations of Hard Level Section

        System.out.println("........");
        System.out.println("Instructions");
        System.out.println("1-Guess the letter.");
        System.out.println("2-You have total of 5 chances. ");
        System.out.println("3-You can only make one guess at a time.");
        System.out.println("........");

        int secretIndex = (int) (Math.random() * alphabet.length);
        String secretVowel = alphabet[secretIndex];
        String guess;
        int numberOfGuesses = 0;

        for(int i=0; i<totalChances; i++){ // Guessing Input Section.
            System.out.println("Guess the letter: ");
            guess = sc.nextLine().toLowerCase();
            numberOfGuesses++;

            for(int j=0; j<alphabet.length; j++){
                //this "for loop" is to find the index of the scanned letter, so we can compare its placement with the secret letter
                if(guess.equals(alphabet[j]))
                    index = j;
            }

            if(guess.equals(secretVowel)){
                System.out.println("Congrats! You find the answer in " + numberOfGuesses +" guesses.");
                if(numberOfGuesses < highestScore)
                    highestScore = numberOfGuesses;
                break;
            } else if(index < secretIndex)
                System.out.println("Your guess is too low! (You have "+(totalChances-numberOfGuesses)+" guesses left.)");
            else
                System.out.println("Your guess is too much! (You have "+(totalChances-numberOfGuesses)+" guesses left.)");
        }
    }

    public static int getHighestScore(){ // High Score part.
        return highestScore;
    }
}