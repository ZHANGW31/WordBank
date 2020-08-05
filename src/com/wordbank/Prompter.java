package com.wordbank;

public class Prompter {

    public String nameMessage() {
        return "Please Enter Your Name: ";
    }

    public String welcomeMessage() {
        return "Good Luck!";
    }
    public String selectLevel(){
        return "Select Level. Levels are Easy, Medium and Hard";
    }

    public String rightAnswerMessage() {

        return "Entry accepted! Accessing funds....";
    }

    public String wrongAnswerMessage() {
        return "Access denied... Please Try Again... -The computer is getting suspicious of you- ";
    }

    public String endOfTryMessage() {
        return "Uh oh, looks like you got too greedy! A SWAT team breaks through your windows, GAME OVER!";
    }

    public String rightAnswerCashAmount(int cashReward) {
        return "You have received: $" + cashReward + " worth of intCoin. Depositing in your digital wallet now.";
    }

    public String cashOutBalanceMessage(int cashOut){
        return "Your cash out balance is: $"+ cashOut;
    }

}
