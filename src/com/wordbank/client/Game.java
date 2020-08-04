package com.wordbank.client;

import com.wordbank.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;



public class Game {

    QuestionFactory questionFactory = new QuestionFactory(); //

    WordBankCollection wordBankCollection = new WordBankCollection();// instance of wordBankCollection
    private Level level; // instance of Level enum
    Player player = new Player(); // creating new instance of player

    Prompter prompter = new Prompter();
    Scanner scanner = new Scanner(System.in);

    public Game() throws IOException {
    }


    public void start() {





        //This block of code reads and println out the Welcome_Banner.txt file.
        try (BufferedReader reader = new BufferedReader(new FileReader("Welcome_Banner.txt"))) {
            Stream<String> line = reader.lines();
            line.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prompter.nameMessage());
        String name = scanner.nextLine();
        player.setName(name);

        System.out.println(prompter.welcomeMessage()+name);



    }


    public void askQuestion (String lvl){
        int balance =0;
        Scanner scanner = new Scanner(System.in);
        String userInput= " ";
        System.out.println("Enter Level. Levels are Easy, Medium and Hard");
        lvl= scanner.nextLine().toUpperCase();

        if(lvl.equals(level.EASY.getValue())) {

                System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                        questionFactory.getRandomNumber(2, 3) + " character");
                userInput = scanner.nextLine().toLowerCase();


                if (wordBankCollection.getEasyWords().contains(userInput)) {
                    System.out.println(prompter.rightAnswerMessage());
                    int cashEarning = player.cashEarned(userInput);
                    System.out.println(prompter.rightAnswerCashAmount((cashEarning)));
                    balance = cashEarning;
                } else {
                    System.out.println(prompter.wrongAnswerMessage());
                    userInput = scanner.nextLine().toLowerCase();
                    if (wordBankCollection.getEasyWords().contains(userInput)) {
                        System.out.println(prompter.rightAnswerMessage());
                        System.out.println(prompter.rightAnswerCashAmount(player.cashEarned(userInput)));
                    } else {
                        System.out.println(prompter.endOfTryMessage());
                    }
                }

        } else if(lvl.equals(level.MEDIUM.getValue())) {


            System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                            questionFactory.getRandomNumber(4, 6) + " character");
            userInput= scanner.nextLine().toLowerCase();
            if(wordBankCollection.getMediumWords().contains(userInput)){
                System.out.println(prompter.rightAnswerMessage());
                System.out.println(prompter.rightAnswerCashAmount(player.cashEarned(userInput)));
            }else {
                System.out.println(prompter.wrongAnswerMessage());
                userInput= scanner.nextLine().toLowerCase();
                if(wordBankCollection.getMediumWords().contains(userInput)){
                    System.out.println(prompter.rightAnswerMessage());
                    System.out.println(prompter.rightAnswerCashAmount(player.cashEarned(userInput)));
                }else {
                    System.out.println(prompter.endOfTryMessage());
                }
            }


        } else if(lvl.equals(level.HARD.getValue())) {

            System.out.println(questionFactory.getRandomQuestion() + ". The word has" +
                        questionFactory.getRandomNumber(7, 20) + "character");
            userInput = scanner.nextLine().toLowerCase();
            if(wordBankCollection.getHardWords().contains(userInput)){
                System.out.println(prompter.rightAnswerMessage());
                System.out.println(prompter.rightAnswerCashAmount(player.cashEarned(userInput)));
            }else{
                System.out.println(prompter.wrongAnswerMessage());
                userInput =scanner.nextLine().toLowerCase();
                if(wordBankCollection.getHardWords().contains(userInput)){
                    System.out.println(prompter.rightAnswerMessage());
                    System.out.println(prompter.rightAnswerCashAmount(player.cashEarned(userInput)));
                }else{
                    System.out.println(prompter.endOfTryMessage());
                }
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

    }

}
