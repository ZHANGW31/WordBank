package com.wordbank;

import java.util.Comparator;

public class Word implements Comparator {
    // instance- variables, fields and attributes
    private  int lengthOfWord; // number of characters of words


    // Enum instance
    private Level level = Level.EASY;

    // Constructors
    public Word(){
        // no args
    }



    //Business Method
    public String categorizeWord(){ // Method to determine the word in different category
        String result= "";
        if(lengthOfWord <=3){
            result = level.EASY.getValue();
        } else if(lengthOfWord >3 && lengthOfWord <=6){
            result = level.MEDIUM.getValue();
        }else if(lengthOfWord >6){
            result = level.HARD.getValue();
        }

        return result;
    }


    // Accessor method fro private fields
    public int getLengthOfWord() {

        return lengthOfWord;
    }

    public void setLengthOfWord(int lengthOfWord) {

        this.lengthOfWord = lengthOfWord;
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
