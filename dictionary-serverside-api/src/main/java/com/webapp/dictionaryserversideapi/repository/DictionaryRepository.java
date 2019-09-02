package com.webapp.dictionaryserversideapi.repository;

import com.webapp.dictionaryserversideapi.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends MongoRepository<Word, String> {
}
