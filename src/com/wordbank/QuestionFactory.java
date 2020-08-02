package com.wordbank;

import java.util.Random;

public class QuestionFactory {

    // instances
    private char firstLetter;
    private String question= " What is the word that starts with:";

    // method to generate a random question
    public String generateQuestion(){
        String question="";

        return question;
    }

    public String getRandomQuestion(){

        Random random = new Random();
        char c = (char)(random.nextInt(26)+ 'a');

        return question + c;
    }
}
