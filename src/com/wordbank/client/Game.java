package com.wordbank.client;

import com.wordbank.Level;
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
    WordBankCollection wordBankCollection;
    private Level level;



    public void start() throws IOException {


        //This block of code reads and println out the Welcome_Banner.txt file.
        try (BufferedReader reader = new BufferedReader(new FileReader("Welcome_Banner.txt"))) {
            Stream<String> line = reader.lines();
            line.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Welcome to the $WordBank$ heist game!");

        System.out.println("Guess a word that you think is in the WordBank, starts with following Character");


    }


    public void askQuestion (){
        int i =0;
        switch (level) {
            case EASY:
                // TODO
                try{
                    for ( i = 1; i <= 5; i++) {
                        System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                                questionFactory.getRandomNumber(1, 3) + "character");

                    }
                }catch (NullPointerException e){
                    e.getMessage();
                }

            case MEDIUM:
                for(i=1;i<=5;i++){
                    System.out.println(questionFactory.getRandomQuestion()+ ". The word has" +
                            questionFactory.getRandomNumber(4,6)+ " character");
                }
            case HARD:
                for (i=1; i<=5; i++){
                    System.out.println(questionFactory.getRandomQuestion()+ ". The word has"+
                            questionFactory.getRandomNumber(7,50)+ "character");
                }
        }
    }

    public void correctAnswer(){
       String userInput= console.readLine();
       switch (level) {
           case EASY:
           if (wordBankCollection.setEasyWords().contains(console.readLine())) {
               console.printf("Correct Answer!");
           } else {
               console.printf("Try again");
           }
           case MEDIUM:
               if(wordBankCollection.setMediumWords().contains(console.readLine())){
                   console.printf("Correct Answer!");
               }else{
                   console.printf("Try again");
               }
           case HARD:
               if(wordBankCollection.setHardWords().contains(console.readLine())){
                   console.printf("Correct Answer!");

               } else{
                   console.printf("Try again");
               }
       }
    }

    public int cashBalance(String inputWord){
        int cashOutBalance=0;
        switch (level){
            case EASY:
                cashOutBalance = inputWord.length()*100;
            case MEDIUM:
                cashOutBalance = inputWord.length()*250;
            case HARD:
                cashOutBalance = inputWord.length()*500;
        }
        return cashOutBalance;
    }


    // Main method
    public static void main(String[] args) throws IOException { // this IO exception needs to be removed, it is only for
        // getting compile error away.

        Game game = new Game();
        game.start();
        game.askQuestion();
        game.correctAnswer();




    }

}
