package com.wordbank;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

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

    public Set<String> answerKey(int length, char firstCharacter, Set<String> inputSet){

        int counter = 0;
        Set<String> resultSet = new LinkedHashSet<>();

        for (String word: inputSet) {
            if (word.charAt(0) == firstCharacter && word.length() == length){
                counter++;
                resultSet.add(word);

            }
        }
        System.out.println("There are " + counter + " possible words.");
        return resultSet;
    }

    public boolean validateQuestion(int length, char firstCharacter, Set<String> inputSet){
        int counter = 0;
        boolean result = false;

        for (String word: inputSet) {
            if (word.charAt(0) == firstCharacter && word.length() == length){
                counter++;
            }
        }
        if (counter > 0){
            result = false;
        } else {
            result = true;
        }

        return result;
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
                }
            case HARD:
                if(wordLength.length()>=4 && wordLength.length()<=6){
                    this.level =level.MEDIUM;

                }
            case MEDIUM:
                if(wordLength.length()>=7){
                    this.level = level.HARD;
                }
            default:
                break;
        }
        this.level = level;
    }

}

