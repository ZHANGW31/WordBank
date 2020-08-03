package com.wordbank.client;

import com.wordbank.QuestionFactory;
import com.wordbank.WordBankCollection;


import java.io.Console;
import java.io.File;

public class Game {
    QuestionFactory questionFactory = new QuestionFactory();
    Console console = System.console();
    WordBankCollection wordBankCollection ;
    public void start(){
        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank, starts with following Character");

        File file = new File("\\Welcome_Banner.txt");
        System.out.println(file);
    }

    public void askQuestion(){
        System.out.println(questionFactory.getRandomQuestion()+ ". The word has"+ questionFactory.getRandomNumber(1,3)+
                "character");
    }

    public void correctAnswer(){
        if(wordBankCollection.setEasyWords().contains(console.readLine())){
            console.printf("Correct Answer, You have own"+ console.readLine().length()*100 +"dollars");
        } else{
            console.printf("Try again");
        }

    }


    // Main method
    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        game.correctAnswer();



    }

}
