package com.wordbankclient;

import com.wordbank.Level;
import com.wordbank.QuestionFactory;

import java.io.Console;

public class Game {
    public static void main(String[] args) {

        Console console = System.console();
        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank, starts with following Character");

        QuestionFactory questionFactory = new QuestionFactory();


        //console.printf(questionFactory.getRandomQuestion()); // generate random question

       // String userInput = console.readLine();
        Word word = new Word(Level.EASY);
        System.out.println(questionFactory.getRandomQuestion());

        console.readLine();
        //String userInput = scanner.nextLine();

       // Player player = new Player();
        //String playerInput = player.answerTheQuestion(scanner.nextLine()); // allows player to input word

        // TODO: for certain level, if player answer is correct, player cashbalance will be added
        /*if((level.getValue()) && playerInput.length()<=3 ){
            player.cashOut();
        }*/


    }

}
