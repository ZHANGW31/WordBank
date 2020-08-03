package com.wordbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private int currentLives = 3; // player starts with current live
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

    public Player(String name, int cash, int currentLives) {
        this(name, cash);
        setCurrentLives(currentLives);
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

    public String answerTheQuestion() {
       Random rand = new Random();
       return null;
    }

    public boolean isAnsweredAlready (char answer) {
        return true; //previousAnswer.contains(answer);
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

    public int getCurrentLives() {
        return currentLives;
    }

    public void setCurrentLives(int currentLives) {
        this.currentLives = currentLives;
    }
}