package com.wordbank;

import java.util.ArrayList;
import java.util.Collection;

public class WordBankCollection implements WordBank {

    //fields and attributes
    private ArrayList<Word> worldList = new ArrayList<>();




    //Constructors




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
