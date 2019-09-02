package com.webapp.dictionaryserversideapi.controller;

import com.webapp.dictionaryserversideapi.exception.DictionaryException;
import com.webapp.dictionaryserversideapi.model.Word;
import com.webapp.dictionaryserversideapi.response.DictionaryResponse;
import com.webapp.dictionaryserversideapi.service.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
public class DictionaryController implements ErrorController {

    @Autowired
    DictionaryServiceImpl dictionaryService;

    @PostMapping("/save")
    public ResponseEntity<DictionaryResponse> saveNewWord(@RequestBody @Valid Word newWord) throws DictionaryException {
        try {
            if (newWord.equals(null)) {
                throw new DictionaryException("New Word cannot be null.");
            }
            DictionaryResponse response = dictionaryService.insertNewWord(newWord);
            if (Objects.isNull(response.getErrorMessage()))
                return new ResponseEntity("Word saved successfully.", HttpStatus.CREATED);
            else return new ResponseEntity("Something went wrong, could not save word.", HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            throw new DictionaryException("Exception Occurred in " + this.getClass().getSimpleName() + " ; message : " + e.getMessage());
        }
    }

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    public String error() {
        System.out.println("ErrorHandling");
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
