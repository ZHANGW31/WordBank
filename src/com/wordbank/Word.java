package com.wordbank;

public class Word {
    // instance- variables, fields and attributes
    private  int lengthOfWords; // number of characters of words
    private char firstLetter; // starting character fo word for question

    // Enum instance
    private Level level = Level.EASY;

    //Business Method
    public String categorizeWord(){ // Method to determine the word in different category
        String result= "";
        if(lengthOfWords<=3){
            result = level.EASY.getValue();
        } else if(lengthOfWords>3 && lengthOfWords<=6){
            result = level.MEDIUM.getValue();
        }else if(lengthOfWords>6){
            result = level.HARD.getValue();
        }

        return result;
    }

    // Accessor method fro private fields
    public int getLengthOfWords() {
        return lengthOfWords;
    }

    public void setLengthOfWords(int lengthOfWords) {
        this.lengthOfWords = lengthOfWords;
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
