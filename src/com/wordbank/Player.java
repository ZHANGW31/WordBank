package com.wordbank;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    private String name;
    private int cash; // current score
    private int lives; // current lives count

    List<String> usedWord = new ArrayList<>(); // List to store all the used word by the player

    // CONSTRUCTORS

    public Player() {
        // no - arg constructor
    }

    public Player(String name) {
        setName(name);
    }

    public Player (String name, int cash) {
        this(name);
        setCash(cash);
    }

    public Player (String name, int cash, int lives) {
        this(name,cash);
        setLives(lives);
    }

    // BUSINESS METHOD

    public void startGame() {

    }

    public String answerTheQuestion(String answer) {

        return answer;
    }

    public void cashOut() {

    }

    // ACCESSORIES METHOD
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

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}