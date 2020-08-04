package com.wordbank;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private int currentLives = 3; // player starts with current live
    private int maxLives = 3;
    private static int easyPrize = 100;
    private static int mediumPrize = 200;
    private static int hardPrize = 300;

    private Level level;



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
    public int cashBalance(String inputWord){
        int cashOutBalance=0;
        switch (level){
            case EASY:
                cashOutBalance = inputWord.length()*100;
            case MEDIUM:
                cashOutBalance = inputWord.length()*250;
            case HARD:
                cashOutBalance = inputWord.length()*500;
        }
        return cashOutBalance;
    }



    public String answerTheQuestion(String answer) {

        return answer;
    }

    public boolean isAnsweredAlready (char answer) {

        return true; //previousAnswer.contains(answer);
    }


    public boolean cashOut() {

        return true;
    }

    // ACCESSORS METHOD
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCash() {

        return cash;
    }

    public void setCash(int cash) {

        this.cash = cash;
    }

    public int getCurrentLives() {

        return currentLives;
    }

    public void setCurrentLives(int currentLives) {

        this.currentLives = currentLives;
    }
}