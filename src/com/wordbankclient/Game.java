package com.wordbankclient;

import com.wordbank.QuestionFactory;

public class Game {
    public static void main(String[] args) {
        QuestionFactory questionFactory = new QuestionFactory();

        System.out.println("Welcome to the $WordBank$ heist game!");
        for(int i =0; i<10; i++) {
            System.out.println(questionFactory.getRandomQuestion());
        }
    }

}
