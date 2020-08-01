package com.wordbank;

import java.util.Collection;

public interface WordBank {

    Collection<Word> findByWord(String word);

    Word findByFirstLetter(char letter);

    int lengthOfWord();

}
