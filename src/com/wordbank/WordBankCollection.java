package com.wordbank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class WordBankCollection {

    //fields and attributes
    private Set<String> allWords = new LinkedHashSet<>();
    private Set<String> easyWords = new LinkedHashSet<>();
    private Set<String> mediumWords = new LinkedHashSet<>();
    private Set<String> hardWords = new LinkedHashSet<>();

    private static final int EASY_WORD_MIN_LENGTH = 1;
    private static final int EASY_WORD_MAX_LENGTH = 3;
    private static final int MEDIUM_WORD_MIN_LENGTH = 4;
    private static final int MEDIUM_WORD_MAX_LENGTH = 6;
    private static final int HARD_WORD_MIN_LENGTH = 7;

    public WordBankCollection() throws IOException {

        //This constructor upon creation, sets the path to the data file, in this case is the WordBank.txt.
        //Then using Stream and Files.lines methods, parses the text document and adds each word line by line into a LinkedHashSet.

        /*Path path = Paths.get("WordBank.txt");

        Files.lines(path).forEach(System.out::println);

        try(Stream<String> lines = Files.lines(path)) {
            lines.forEach(word -> allWords.add(word));
        } catch (IOException ex) {
            System.out.println("An error has occurred reading the data file");
        }*/

        try (BufferedReader reader = new BufferedReader(new FileReader("WordBank.txt"))) {
            Stream<String> line = reader.lines();
            line.forEach(allWords::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setEasyWords();
        setMediumWords();
        setHardWords();



    }
    //Accessor Methods

    public Set<String> getAllWords() {
        return allWords;
    }

    public Set<String> setEasyWords(){

        for (String word : allWords){
            if (word.length() >= EASY_WORD_MIN_LENGTH && word.length() <= EASY_WORD_MAX_LENGTH){
                easyWords.add(word);
            }
        }
        return easyWords;
    }

    public Set<String> setMediumWords() {
        for (String word : allWords){
            if (word.length() >= MEDIUM_WORD_MIN_LENGTH && word.length() <= MEDIUM_WORD_MAX_LENGTH){
                mediumWords.add(word);
            }
        }
        return mediumWords;
    }
    public Set<String> setHardWords(){
        for (String word : allWords){
            if (word.length() >= HARD_WORD_MIN_LENGTH){
                hardWords.add(word);
            }
        }
        return hardWords;
    }

    public Set<String> getEasyWords() {
        return easyWords;
    }

    public Set<String> getMediumWords() {
        return mediumWords;
    }

    public Set<String> getHardWords() {
        return hardWords;
    }

    //Business methods

    public int longestLengthWordInSet(Set<String> inputSet){
        String longestWord;
        int result = 7;

        for (String word : inputSet){
            if (word.length() > result){
                longestWord = word;
                System.out.println("current longest word is: " + longestWord);
                result = word.length();
            }
        }

        return result;

    }

    public String validGeneratedQuestion(int length, char firstCharacter, Set<String> inputSet){

        int counter = 0;

        for (String word: inputSet) {
            if (word.charAt(0) == firstCharacter && word.length() == length){
                counter++;
            }
        }


        return "There are " + counter + " possible words.";
    }
    


    //TODO: create a method that removes the word from the list if the user guesses it correctly

    public void removeWord(String input, Set<String> wordLinkedHashSet) {
        wordLinkedHashSet.remove(input);
    }






}
