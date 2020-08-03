package com.wordbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private static int currentLives = 3; // player starts with current live
    private int maxLives = 3;


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

    public boolean gameOver() {
        if (youWin()) {
        } else if (youLose()) {
            return true;
        }
        return false;
    }

    public boolean youWin() {
        return usedWord.equals(usedWord);
    }

    public boolean youLose() {
        return currentLives >= maxLives;
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

    public static int getCurrentLives() {
        return currentLives;
    }

    public static void setCurrentLives(int currentLives) {
        Player.currentLives = currentLives;
    }
}