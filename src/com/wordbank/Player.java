package com.wordbank;

import java.util.ArrayList;
import java.util.List;

public class Player {

    // INSTANCE VARIABLES - Fields, aka, Properties

    public String name;
    public int cash; // current score
    public int lives; // current lives count

    List<String> word = new ArrayList<>();

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