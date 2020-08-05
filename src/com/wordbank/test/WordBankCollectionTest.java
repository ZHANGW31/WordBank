package com.wordbank.test;

import com.wordbank.Level;
import com.wordbank.Prompter;
import com.wordbank.QuestionFactory;
import com.wordbank.WordBankCollection;

import java.io.IOException;
import java.util.*;


public class WordBankCollectionTest {
    WordBankCollection wordBankCollection = new WordBankCollection();

    public void testing() {

    List<String> easyWords = new LinkedList<>();
    easyWords.addAll(wordBankCollection.getEasyWords());
    System.out.println(easyWords);
   }
    public WordBankCollectionTest() throws IOException {
    }
    public void generateMediumQuestion(){

        String question= null;
        String randomWord = null;
        int rand;
        List<String> mediumQuestion = new LinkedList<>();
        mediumQuestion.addAll(wordBankCollection.getMediumWords()); // adds all medium words to the LinkedList
        Collections.sort(mediumQuestion); // sorts the Linkedlist
        Random random = new Random(); // instantiating Random Method
        rand = random.nextInt((mediumQuestion.size()-1)+1);
        randomWord = mediumQuestion.get(rand);
        question = " The word starting with: " + randomWord.charAt(0)+ ". The word has "+ randomWord.length() + " characters.";
        System.out.println(question);
    }



//    public void generateQuestion(){
//
//    }
    public static void main(String[] args) throws IOException {

//        Prompter prompter= new Prompter();
//
//        Level level = Level.EASY;
       WordBankCollectionTest wordBankCollectionTest = new WordBankCollectionTest();
//        wordBankCollectionTest.generateMediumQuestion();
        wordBankCollectionTest.testing();
    }

}