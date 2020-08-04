package com.wordbank.client;

import com.wordbank.*;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;



public class Game {

    QuestionFactory questionFactory = new QuestionFactory(); //
    Console console = System.console();
    WordBankCollection wordBankCollection; // instance of wordBankCollection
    private Level level; // instance of Level enum
    //Player player = new Player(); // creating new instance of player
    Prompter prompter = new Prompter();
    Scanner scanner = new Scanner(System.in);



    public void start() throws IOException {





        //This block of code reads and println out the Welcome_Banner.txt file.
        try (BufferedReader reader = new BufferedReader(new FileReader("Welcome_Banner.txt"))) {
            Stream<String> line = reader.lines();
            line.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prompter.nameMessage());
        String name = scanner.nextLine();

        System.out.println(prompter.welcomeMessage()+name);



    }


    public void askQuestion (String lvl){
        int i =0;
        Scanner scanner = new Scanner(System.in);
        String userInput= " ";
        System.out.println("Enter Level. Levels are Easy, Medium and Hard");
        lvl= scanner.nextLine();
        if(lvl.equals(level.EASY.getValue())) {

            System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                    questionFactory.getRandomNumber(2, 3) + " character");
            userInput = scanner.nextLine();

            if(wordBankCollection.setEasyWords().contains(userInput)){
                System.out.println(prompter.rightAnswerMessage());
            } else{
                System.out.println(prompter.wrongAnswerMessage());
                userInput = scanner.nextLine();
                if(wordBankCollection.setEasyWords().contains(userInput)){
                    System.out.println(prompter.rightAnswerMessage());
                }else {
                    System.out.println(prompter.endOfTryMessage());
                }
            }
        } else if(lvl.equals(level.MEDIUM.getValue())) {


            System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                            questionFactory.getRandomNumber(4, 6) + " character");
            userInput= scanner.nextLine();
            if(wordBankCollection.setMediumWords().contains(userInput)){
                System.out.println(prompter.rightAnswerMessage());
            }else {
                System.out.println(prompter.wrongAnswerMessage());
                userInput= scanner.nextLine();
                if(wordBankCollection.setMediumWords().contains(userInput)){
                    System.out.println(prompter.rightAnswerMessage());
                }else {
                    System.out.println(prompter.endOfTryMessage());
                }
            }


        } else if(lvl.equals(level.HARD.getValue())) {

            System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                        questionFactory.getRandomNumber(7, 20) + "character");
            userInput = scanner.nextLine();
            if(wordBankCollection.setHardWords().contains(userInput)){
                System.out.println();
            }else{
                System.out.println(prompter.wrongAnswerMessage());
                userInput =scanner.nextLine();
                if(wordBankCollection.setHardWords().contains(userInput)){
                    System.out.println(prompter.rightAnswerMessage());
                }else{
                    System.out.println(prompter.endOfTryMessage());
                }
            }

        }

    }

    public void correctAnswer(String userInput){
        userInput= scanner.nextLine();
       switch (level) {
           case EASY:
           if (wordBankCollection.setEasyWords().contains(userInput)) {
               System.out.println(prompter.rightAnswerMessage());
           } else {
               System.out.println(prompter.wrongAnswerMessage());;
           }
           case MEDIUM:
               if(wordBankCollection.setMediumWords().contains(userInput)){
                   System.out.println(prompter.rightAnswerMessage());;
               }else{
                   System.out.println(prompter.wrongAnswerMessage());
               }
           case HARD:
               if(wordBankCollection.setHardWords().contains(userInput)){
                   System.out.println(prompter.rightAnswerMessage());

               } else{
                   System.out.println(prompter.wrongAnswerMessage());
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
        game.askQuestion(Level.EASY.getValue());



        Scanner myScan = new Scanner(System.in);
        Player p1 = new  Player();
        System.out.println("P1 set your name: ");
        String p1Name = myScan.nextLine();
        p1.setName(p1Name);

    }

}
