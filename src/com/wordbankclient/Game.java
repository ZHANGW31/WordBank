package com.wordbankclient;

import com.wordbank.QuestionFactory;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.io.Console;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank starts with following Character");

        QuestionFactory questionFactory = new QuestionFactory();
        Console console = System.console();

        //console.printf(questionFactory.getRandomQuestion()); // generate random question

       // String userInput = console.readLine();
        System.out.println(questionFactory.getRandomQuestion());
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();



    }

}
