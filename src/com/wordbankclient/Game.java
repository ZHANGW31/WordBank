package com.wordbankclient;
import java.io.Console;

import com.wordbank.Level;
import com.wordbank.Player;
import com.wordbank.QuestionFactory;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        QuestionFactory questionFactory = new QuestionFactory();
        Level level;
        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println(questionFactory.getRandomQuestion());
        String startingLetter = questionFactory.getRandomQuestion();
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        String playerInput = player.answerTheQuestion(scanner.nextLine()); // allows player to input word

        // TODO: for certain level, if player answer is correct, player cashbalance will be added
        /*if((level.getValue()) && playerInput.length()<=3 ){
            player.cashOut();

        }*/
    }

}
