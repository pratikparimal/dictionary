package com.webapp.dictionaryserversideapi.dao;

import com.webapp.dictionaryserversideapi.exception.DictionaryException;
import com.webapp.dictionaryserversideapi.model.Word;
import com.webapp.dictionaryserversideapi.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class DictionaryDAOImpl {

    @Autowired
    DictionaryRepository dictionaryRepository;

    @Transactional
    public Word insertNewWordInDB(Word newWord) throws DictionaryException {
        try {
            Word insertedWord = dictionaryRepository.save(newWord);
            return insertedWord;
        } catch (Exception e) {
            throw new DictionaryException("Exception Occurred in " + this.getClass().getSimpleName() + " ; message : " + e.getMessage());
        }
    }
}
