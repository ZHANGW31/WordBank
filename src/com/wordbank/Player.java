package com.wordbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private static int currentLives = 1; // player starts with current live
    private static int maxLives = 3; // Player can get 3 lives

    List<String> usedWord = new ArrayList<>(); // List to store all the used word by the player

    // CONSTRUCTORS

    public Player() {
        // no - arg constructor
    }

    public Player(String name) {
        setName(name);
    }

    public Player(String name, int cash) {
        this(name);
        setCash(cash);
    }


    // BUSINESS METHOD

    public void startGame() {
//        int numberOfGuesses = 0;
//        String original = selectRandomWord();
//        String shuffled = getShuffledWord(original);
//        boolean gameOn = true;
//        while(gameOn) {
//            numberOfGuesses++;
//            String playerGuess = getUserGuess();
//            if(original.equalsIgnoreCase(playerGuess)) {
//                System.out.println("Congratulations! You found the word in " + numberOfGuesses +" guesses");
//                gameOn = false;
//            }
//            else {
//                System.out.println("Sorry, Wrong answer");
//            }
//
//        }
//
//    }
    }

    public String answerTheQuestion(String answer) {

        return answer;
    }

    public void cashOut() {

    }

    // ACCESSORY METHOD
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getCash() {
        return cash;
    }

    private void setCash(int cash) {
        this.cash = cash;
    }
}