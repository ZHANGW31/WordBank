package com.wordbank.client;

import com.wordbank.QuestionFactory;
import com.wordbank.WordBankCollection;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Game {
    QuestionFactory questionFactory = new QuestionFactory();
    Console console = System.console();
    WordBankCollection wordBankCollection ;
    public void start() throws IOException {

        /*
          *can you put the file path, i am not able to do so
         */
        /*Path file = Paths.get("/IdeaProjects/WordBank/data/Welcome_Banner.txt");
        Files.lines(file).forEach(System.out::println);*/

        /*String banner = Files.readString(Path.of("data", "Welcome_Banner.txt"));
        Files.lines(Path.of("data","Welcome_Banner.txt")).forEach(line -> System.out.println(line));*/

        try (BufferedReader reader = new BufferedReader(new FileReader("Welcome_Banner.txt"))) {
            Stream<String> line = reader.lines();
            line.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

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
