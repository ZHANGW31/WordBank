package com.wordbank;

import java.util.Random;

public class QuestionFactory {

    // instances
    private char firstLetter;

    private String question= " Word that starts with:";
    private String wordLength;


    private Level level;

    private String lvl;

    // method to generate a random question
    public String getRandomQuestion(){

        Random random = new Random();
        firstLetter = (char)(random.nextInt(26)+ 'a'); // Generates the random question with starting character a-z

        question = question + firstLetter ;

        return question;
    }


    public int getRandomNumber(int min, int max){
        int i;

        Random random = new Random();
        int randomNumber =  random.nextInt((max-min)+1)+min;


        return randomNumber;
    }


    public String getQuestion() {
        return question;
    }

    //TODO:
    public void setQuestion(String question) {

        this.question = question;
    }
    public Level getLevel() {
        return level;
    }



}

