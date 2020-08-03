package com.wordbank.client;

import com.wordbank.QuestionFactory;
import com.wordbank.WordBankCollection;


import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Game {
    QuestionFactory questionFactory = new QuestionFactory();
    Console console = System.console();
    WordBankCollection wordBankCollection ;
    public void start() throws IOException {

        /*
          *can you put the file path, i am not able to do so
         */
        Path file = Paths.get("/Users/rajansmac/IdeaProjects/WordBank/Welcome_Banner.txt");
        Files.lines(file).forEach(System.out::println);

        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank, starts with following Character");


    }

    public void askQuestion(){
        System.out.println(questionFactory.getRandomQuestion()+ ". The word has"+ questionFactory.getRandomNumber(1,3)+
                "character");
    }

    public void correctAnswer(){
       String userInput= console.readLine();
        if(wordBankCollection.setEasyWords().contains(console.readLine())){
            console.printf("Correct Answer!");
        }
    }


    // Main method
    public static void main(String[] args) throws IOException { // this IO exception needs to be removed, it is only for
        // getting compile error away.

        Game game = new Game();
        game.start();
        game.correctAnswer();



    }

}
