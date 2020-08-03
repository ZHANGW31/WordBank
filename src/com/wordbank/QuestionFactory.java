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
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        switch (level){
            case EASY:
                if(wordLength.length()<=3){
                    this.level=level.EASY;
                    getRandomNumber(1,3);
                }
            case HARD:
                if(wordLength.length()>=4 && wordLength.length()<=6){
                    this.level =level.MEDIUM;
                    getRandomNumber(4,6);
                }
            case MEDIUM:
                if(wordLength.length()>=7){
                    this.level = level.HARD;
                    getRandomNumber(7,15);
                }
            default:
                break;
        }
        this.level = level;
    }

}

