package com.wordbankclient;

import com.wordbank.Level;
import com.wordbank.Player;
import com.wordbank.QuestionFactory;
import com.wordbank.Word;

import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArraySet;

public class Game {
    public static void main(String[] args) {

        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank starts with following Character");

        QuestionFactory questionFactory = new QuestionFactory();
        Console console = System.console();

        //console.printf(questionFactory.getRandomQuestion()); // generate random question

       // String userInput = console.readLine();
        Word word = new Word(Level.EASY);
        System.out.println(questionFactory.getRandomQuestion());
        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.nextLine();

       // Player player = new Player();
        //String playerInput = player.answerTheQuestion(scanner.nextLine()); // allows player to input word

        // TODO: for certain level, if player answer is correct, player cashbalance will be added
        /*if((level.getValue()) && playerInput.length()<=3 ){
            player.cashOut();
        }*/


    }

}
