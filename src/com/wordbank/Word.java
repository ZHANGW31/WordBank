package com.wordbank;

import java.util.Comparator;
import java.util.List;

public class Word implements Comparator {
    // instance- variables, fields and attributes
    private  int lengthOfWords; // number of characters of words


    // Enum instance
    private Level level = Level.EASY;

    // Constructors
    public Word(){
        // no args
    }



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


    public Level getLevel() {

        return level;
    }

    public void setLevel(Level level) {

        this.level = level;
    }


    // Method to compare
    @Override
    public int compare(Object o1, Object o2) {
        return 0;

    }
}
