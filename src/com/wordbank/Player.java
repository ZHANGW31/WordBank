package com.wordbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private int currentLives = 3; // player starts with current live
    private int maxLives = 3;
    private static int easyPrize = 100;
    private static int mediumPrize = 200;
    private static int hardPrize = 300;




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

    public String answerTheQuestion(String answer) {
       return answer;
    }

    public boolean isAnsweredAlready (char answer) {
        return true; //previousAnswer.contains(answer);
    }

    public static int calculateScore(String [] words) {
        int sum = 0;
        int count = 0;
        for (String word : words) {
            count++;
            if(contains(easyWords, word)) {
                int thisScore = word.length() * easyPrize;
                sum = sum + thisScore;
            }
            else if(contains(mediumWords, word)) {
                int thisScore = word.length() * mediumPrize;
                sum = sum + thisScore;
            }
            else if(contains(hardWords, word)) {
                int thisScore = word.length() * hardPrize;
                sum = sum + thisScore;
            }
        }
        return sum;
    }

    public static boolean contains( String [] words, String word) {
        for(String inWord : words) {
            if(word == inWord) {
                return true;
            }
        }
        return false;
    }

    public boolean cashOut() {
        return true;
    }

    // ACCESSORY METHOD
    private String getName() {
        return name;
    }

    public void setName(String name) {
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