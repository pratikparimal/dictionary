package com.webapp.dictionaryserversideapi.service;

import com.webapp.dictionaryserversideapi.dao.DictionaryDAOImpl;
import com.webapp.dictionaryserversideapi.exception.DictionaryException;
import com.webapp.dictionaryserversideapi.model.Word;
import com.webapp.dictionaryserversideapi.response.DictionaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl {

    @Autowired
    DictionaryDAOImpl dictionaryDAO;

    public DictionaryResponse insertNewWord(Word newWord) throws DictionaryException {
        try {
            Word insertedWord = dictionaryDAO.insertNewWordInDB(newWord);
            return new DictionaryResponse("Inserted the word in DB");
        } catch (Exception e) {
            throw new DictionaryException("Exception Occurred in " + this.getClass().getSimpleName() + " ; message : " + e.getMessage());
        }
    }
}
