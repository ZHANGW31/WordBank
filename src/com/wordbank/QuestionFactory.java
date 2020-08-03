package com.wordbank;

import java.util.Random;

public class QuestionFactory {

    // instances
    private char firstLetter;

    private String question;
    private Level level;

    private String lvl;

    // method to generate a random question
    public String getRandomQuestion(){

        Random random = new Random();
        firstLetter = (char)(random.nextInt(26)+ 'a'); // Generates the random question with starting character a-z

        return question+ firstLetter;
    }

    public int getRandomNumber(int min, int max){
        int i;

        Random random = new Random();
        for (i=0;i<15; i++){}
        int randomNumber = (int) (Math.random() + 1);
        return randomNumber;
    }
    public String getQuestion() {
        return question;
    }

    //TODO:
    public void setQuestion(String question) {

        this.question = question;
    }


}
