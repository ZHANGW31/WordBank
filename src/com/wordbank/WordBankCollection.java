package com.wordbank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class WordBankCollection implements WordBank {

    //fields and attributes
    private ArrayList<Word> allWordsList = new ArrayList<>(); //All of the words will be stored in this list.

    private ArrayList<Word> easyWordList = new ArrayList<>(); //Easy category words will be stored in this list.

    private ArrayList<Word> mediumWordList = new ArrayList<>(); // Medium category words will be stored in this list.

    private ArrayList<Word> hardWordList = new ArrayList<>(); // Hard category words will be stored in this list.

    private Set<String> allWords = new LinkedHashSet<>();





    public WordBankCollection() throws IOException {
        Path path = Paths.get("C:\\Users\\Public\\Documents\\WordBank.txt");

        Files.lines(path).forEach(System.out::println);

        try(Stream<String> lines = Files.lines(path)) {
            lines.forEach(word -> allWords.add(word));
        } catch (IOException ex) {


        }
    }

    public Set<String> getAllWords() {
        return allWords;
    }

    //Business Methods


    @Override
    public Collection<Word> findByWord(String word) {
        return null;
    }

    @Override
    public Word findByFirstLetter(char letter) {
        return null;
    }

    @Override
    public int lengthOfWord() {
        return 0;
    }





}
