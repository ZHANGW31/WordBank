package com.wordbank.test;

import com.wordbank.WordBankCollection;

import java.io.IOException;



public class WordBankCollectionTest {

    public static void main(String[] args) throws IOException {
        WordBankCollection wordBank = new WordBankCollection();
        System.out.println(wordBank.getEasyWords().size());
        System.out.println(wordBank.getMediumWords().size());
        System.out.println(wordBank.getHardWords().size());
        System.out.println("Total number of words: " + wordBank.getAllWords().size());
        System.out.println(wordBank.longestLengthWordInSet(wordBank.getHardWords()));

        /*Game game = new Game();
        game.start();
        game.askQuestion(Level.EASY.getValue());

         */
    }

}