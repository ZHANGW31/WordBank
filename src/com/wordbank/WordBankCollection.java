package com.wordbank;

import java.util.ArrayList;
import java.util.Collection;

public class WordBankCollection implements WordBank {

    //fields and attributes
    private ArrayList<Word> allWordList = new ArrayList<>(); //All of the words will be stored in this list.

    private ArrayList<Word> easyWordList = new ArrayList<>(); //Easy category words will be stored in this list.

    private ArrayList<Word> mediumWordList = new ArrayList<>(); // Medium category words will be stored in this list.

    private ArrayList<Word> hardWordList = new ArrayList<>(); // Hard category words will be stored in this list.






    //Business Methods


    @Override
    public Collection<Word> findByWord(String word) {
        return null;
    }

    @Override
    public Word findByFirstLetter(char letter) {
        return null;
    }

    @Override
    public int lengthOfWord() {
        return 0;
    }


    //Getters and Setters


}
