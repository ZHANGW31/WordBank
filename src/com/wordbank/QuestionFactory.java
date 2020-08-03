package com.wordbank;

import java.util.Random;

public class QuestionFactory {

    // instances
    private char firstLetter;
    private String question= " What is the word that starts with:";

    // method to generate a random question
    public String getRandomQuestion(){

        Random random = new Random();
        firstLetter = (char)(random.nextInt(26)+ 'a'); // Generates the random question with starting character a-z

        return question + firstLetter;
    }

}