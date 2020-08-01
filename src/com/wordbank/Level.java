package com.wordbank;

// Enum class
public enum Level {
    EASY("Easy"), MEDIUM("Medium"), HARD("Hard");

    private String value;

    Level(String value){
        this.value =value;
    }

    public String getValue(){
        return value;
    }

}
