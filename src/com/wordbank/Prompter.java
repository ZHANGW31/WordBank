package com.wordbank;

public class Prompter {

    public String nameMessage(){
        String message = " Please Enter Your Name: ";
        return message;
    }

    public String welcomeMessage(){
        String message = "Good Luck!";
        return message;
    }

    public String rightAnswerMessage(){
        String message = "Entry accepted! Accessing funds....";
        return message;
    }

    public String wrongAnswerMessage(){
        String message = "Access denied... Please Try Again... -The computer is getting suspicious of you- ";
        return message;
    }

    public String endOfTryMessage(){
        String message = "Uh oh, looks like you got too greedy! A SWAT team breaks through your windows, GAME OVER!";
        return message;
    }

    public String rightAnswerCashAmount(int cashReward){
        String message = "You have received: " + cashReward + " in intCoin. Depositing in your digital wallet now.";
        return message;
    }
}
