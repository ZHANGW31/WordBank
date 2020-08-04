package com.wordbank;

public class Prompter {

    public String nameMessage(){
        String message = " Please Enter your Name";
        return message;
    }

    public String welcomeMessage(){
        String message = " Welcome to WordBank! Good Luck!";
        return message;
    }

    public String rightAnswerMessage(){
        String message = "Correct Answer!";
        return message;
    }

    public String wrongAnswerMessage(){
        String message = "Wrong Answer! Please Try Again";
        return message;
    }

    public String endOfTryMessage(){
        String message = " You are out of lives. GAME OVER";
        return message;
    }
}
