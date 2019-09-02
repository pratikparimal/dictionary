package com.webapp.dictionaryserversideapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


@Document(collection= "words")
public class Word {
    @Id
    @NotNull
    public String word;
    @NotNull
    public String wordDetails;
    public String grammarType;
    public String usage;

    public Word() {
    }

    public Word(String word, String wordDetails, String grammarType, String usage) {
        this.word = word;
        this.wordDetails = wordDetails;
        this.grammarType = grammarType;
        this.usage = usage;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordDetails() {
        return wordDetails;
    }

    public void setWordDetails(String wordDetails) {
        this.wordDetails = wordDetails;
    }

    public String getGrammarType() {
        return grammarType;
    }

    public void setGrammarType(String grammarType) {
        this.grammarType = grammarType;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", wordDetails='" + wordDetails + '\'' +
                ", grammarType='" + grammarType + '\'' +
                ", usage='" + usage + '\'' +
                '}';
    }
}
